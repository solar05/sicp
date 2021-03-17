(ns sicp.chapter02.2-03-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-03 :refer :all]
            [sicp.points :refer [make-point]]
            [sicp.test-helper :refer :all]))

(def rectangle (make-rect (make-point 0 0) (make-point 3 4)))
(def another-rectangle (make-rect (make-point -3 -4) (make-point 0 0)))

(deftest test-segments
  (assert-equal 14.0 (perimeter rectangle))
  (assert-equal 12.0 (area rectangle))
  (assert-equal 14.0 (perimeter another-rectangle))
  (assert-equal 12.0 (area another-rectangle)))
