(ns sicp.chapter02.2-02-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-02 :refer :all]
            [sicp.test-helper :refer :all]))

(deftest test-segments
  (assert-equal [2.0 2.0] (midpoint-segment
                           (make-segment
                            (make-point 1 1)
                            (make-point 3 3))))
  (assert-equal [3.0 4.5] (midpoint-segment
                           (make-segment
                            (make-point 1 2)
                            (make-point 5 7))))
  (assert-equal "(1, 1)" (print-point (make-point 1 1))))
