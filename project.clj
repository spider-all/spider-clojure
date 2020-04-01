(defproject spider "0.0.1"
  :description "A simple example of using SQLite with Clojure"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/java.jdbc "0.7.11"]
                 [org.xerial/sqlite-jdbc "3.30.1"]]
  :main spider.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
