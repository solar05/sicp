(ns sicp.chapter02.2-13-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-13 :refer :all]
            [sicp.test-helper :refer :all]))

(deftest test-interval-percent-tolerance
  (let [first-per (make-interval-center-per 10 0.5)
        second-per (make-interval-center-per 10 0.4)
        third-per (make-interval-center-per 10 0.2)
        fourth-per (make-interval-center-per 10 0.1)]
    (assert-equal 0.8999820003599912 (percent-tolerance (mul-interval first-per second-per)))
    (assert-equal 0.29999940000119 (percent-tolerance (mul-interval third-per fourth-per)))))

