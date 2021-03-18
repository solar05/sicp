(ns sicp.chapter02.2-10-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-10 :refer :all]
            [sicp.test-helper :refer :all]))

(def a (make-interval 2 7))

(def b (make-interval 8 3))

(deftest test-interval-div-mul
  (assert-equal [6 56] (mul-interval a b))
  (assert-equal [0.25 2.333333333333333] (div-interval a b))
  (assert-equal "Division error" (div-interval a (make-interval -1 1))))
