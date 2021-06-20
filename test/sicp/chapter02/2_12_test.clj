(ns sicp.chapter02.2-12-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-12 :refer :all]
            [sicp.test-helper :refer :all]))

(deftest test-interval-percent
  (assert-equal 10.0 (percent (make-center-per 100 10)))
  (assert-equal 30.0 (percent (make-center-per 900 30))))
