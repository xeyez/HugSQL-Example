(ns hugsql-example.db.test-hugsql
  (:require [hugsql.core :as hugsql]
            [hugsql-example.db.db :as db]))

;;반환값으로 결과값만 보여준다
(hugsql/def-db-fns "hugsql_example/db/sql/test_hugsql.sql")

;;반환값으로 Query와 결과값을 보여준다
(hugsql/def-sqlvec-fns "hugsql_example/db/sql/test_hugsql.sql")


;;아래 함수들은 sql 파일에 정의한 name으로 자동 생성
;; 함수뒤에 -sqlvec을 붙이면 query까지 볼 수 있음 (Debug용)

(defn test-conn []
  (test-connection-sqlvec db/connection))

(defn create-table []
  "DDL은 -sqlvec를 붙이면 실제로 수행하지 않음. 그저 Debug 용도."
  (create-test-table db/connection))

(defn drop-table []
  "DDL은 -sqlvec를 붙이면 실제로 수행하지 않음. 그저 Debug 용도."
  (drop-test-table db/connection))

(defn insert [name comment]
  (insert-test db/connection
    {:name name, :comment comment}))

(defn select-all []
  (let [result (select-test-all db/connection)]
    (if (zero? (count result)) nil result)))

(defn select-where-id [id]
  (select-test-where-id db/connection {:id id}))

(defn delete-where-id [id]
  "삭제 성공이면 1, 실패면 0"
  (delete-test-where-id db/connection {:id id}))

(defn update-set-comment-where-id [comment id]
  "삭제 성공이면 1, 실패면 0"
  (update-test-set-comment-where-id db/connection {:comment comment
                                                   :id id}))