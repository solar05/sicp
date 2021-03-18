(ns sicp.chapter02.2-07-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-07 :refer :all]
            [sicp.test-helper :refer :all]))

(def interval (make-interval 2 10))

(deftest test-interval
  (assert-equal 10 (upper-bound interval))
  (assert-equal 2 (lower-bound interval)))
