(ns hugsql-example.core
  (:require [hugsql-example.db.test-hugsql :as test-hugsql])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))



(test-hugsql/create-table)