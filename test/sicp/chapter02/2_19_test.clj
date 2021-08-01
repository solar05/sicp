(ns sicp.chapter02.2-19-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-19 :refer [cc]]
            [sicp.test-helper :refer :all]))

(deftest test-cc
  (let [coins '(50 25 10 5 1)]
    (assert-equal 292 (cc 100 coins))))
