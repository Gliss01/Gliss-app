(defproject gliss "0.1.0-SNAPSHOT"
  :description "Gliss: A simple lightweight application"
  :url "https://github.com/Gliss01/Gliss-app"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.2"]
                 [hiccup "1.0.5"]
                 [ring-server "0.4.0"]]
  :plugins [[lein-ring "0.8.12"]]
  :ring {:handler gliss.handler/app
         :init gliss.handler/init
         :destroy gliss.handler/destroy}
  :profiles
  {:uberjar {:aot :all}
   :production
   {:ring
    {:open-browser? false, :stacktraces? false, :auto-reload? false}}
   :dev
   {:dependencies [[ring-mock "0.1.5"] [ring/ring-devel "1.5.1"]]}})
