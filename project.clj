(defproject example-project "2021.01"
  :description "placeholder"
  :url "https://github.com/dspearson/example-project"
  :license {:name "ISC"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot example-project.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
