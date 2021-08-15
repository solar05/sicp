(ns sicp.chapter02.2-04-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-04 :refer :all]
            [sicp.test-helper :refer :all]))

(def pair (my-cons 2 3))

(deftest test-cons
  (assert-equal 2 (my-car pair))
  (assert-equal 3 (my-cdr pair)))
