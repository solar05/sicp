(ns sicp.chapter02.2-34-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-34 :as ch]
            [sicp.test-helper :refer :all]))

(deftest test-horner-eval
  (assert-equal 79 (ch/horner-eval 2 '(1 3 0 5 0 1))))
