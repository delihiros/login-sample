(defproject little "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.6"]
                 [hiccup "1.0.4"]
                 [com.cemerick/friend "0.2.0"]]
  :plugins [[lein-ring "0.8.8"]]
  :ring {:handler little.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
