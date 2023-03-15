(defproject fboulay/lein-kibit "0.1.8.1-SNAPSHOT"
  :description "Working kibit lein plugin for SonarQube"
  :url "https://github.com/fboulay/lein-kibit"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/tools.namespace "1.4.4"]
                 [jonase/kibit "0.1.8"]
                 [org.clojure/clojure "1.11.1" :scope "provided"]]
  :eval-in-leiningen true)
