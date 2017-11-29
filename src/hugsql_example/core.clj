(ns hugsql-example.core
  (:require [hugsql-example.db.test-hugsql :as test-hugsql])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))


#_ (test-hugsql/test-conn)
#_ (test-hugsql/create-table)
#_ (test-hugsql/insert "luke" "Hello, world!")
#_ (test-hugsql/select-all)
#_ (test-hugsql/select-where-id 1)
#_ (test-hugsql/delete-where-id 5)
#_ (test-hugsql/update-set-comment-where-id "한글 시험" 1)
#_ (test-hugsql/drop-table)

