(ns hugsql-example.db.db)

(def connection
  {:subprotocol "mysql"
   :subname "//127.0.0.1:3306/test_hugsql?useSSL=false"
   :user "root"
   :password "root"})