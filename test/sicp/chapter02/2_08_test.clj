(ns sicp.chapter02.2-08-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-08 :refer :all]
            [sicp.test-helper :refer :all]))

(def a (make-interval 2 10))

(def b (make-interval 8 4))

(deftest test-interval-2
  (assert-equal "[2, 10]" (display-interval a))
  (assert-equal [-6 6] (sub-interval a b))
  (assert-equal [-6 6] (sub-interval b a)))
