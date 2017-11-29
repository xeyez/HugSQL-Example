(ns hugsql-example.db.test-hugsql
  (:require [hugsql.core :as hugsql]
            [hugsql-example.db.db :as db]))

;;값을 직접 Mapping 해야한다
(hugsql/def-db-fns "hugsql_example/db/sql/test_hugsql.sql")

;;Java의 PreparedStatement와 같은 기능
(hugsql/def-sqlvec-fns "hugsql_example/db/sql/test_hugsql.sql")

(defn create-table []
  (create-test-table db/connection))