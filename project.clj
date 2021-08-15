(defproject sicp "0.1.0-SNAPSHOT"
  :description "Sicp solutions!"
  :url "http://github.com/solar05/sicp"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot sicp.core
  :target-path "target/%s"
  :plugins [[lein-cljfmt "0.8.0"]
            [lein-kibit "0.1.8"]]
  :aliases {"kaocha" ["with-profile" "+kaocha" "run" "-m" "kaocha.runner"]}
  :profiles {:uberjar {:aot :all}
             :kaocha {:dependencies [[lambdaisland/kaocha "1.0.861"]]}})
