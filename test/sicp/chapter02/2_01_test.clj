(ns sicp.chapter02.2-01-test
  (:require [clojure.test :refer :all]
            [sicp.ratio :refer :all]
            [sicp.test-helper :refer :all]))

(deftest test-sqrt
  (testing "Ratio numbers."
    (is (= [1 2] (make-rat 3 6)))
    (is (= [1 2] (make-rat -3 -6)))
    (is (= [-1 2] (make-rat -3 6)))
    (is (= [-1 2] (make-rat 3 -6)))
    (is (= [3 1] (make-rat 3)))
    (is (= "1/2" (str-rat (make-rat 3 6))))
    (is (= "-1/2" (str-rat (make-rat 3 -6))))))

(deftest test-with-helper
  (assert-equal [1 2] (make-rat 3 6)))
