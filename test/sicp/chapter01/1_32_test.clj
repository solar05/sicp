(ns sicp.chapter01.1-32-test
  (:require [sicp.chapter01.1-32 :refer :all]
            [clojure.test :refer :all]))

(defn factorial [n product-fn]
  (product-fn identity 1 inc n))

(defn pi-sum [a b sum-fn]
  (letfn [(pi-term [x] (/ 1.0 (* x (+ x 2))))
          (pi-next [x] (+ x 4))]
    (sum-fn pi-term a pi-next b)))

(deftest recursive-acc-test
  (testing  "Recursive acc product test"
    (is (= 120 (factorial 5 product)))
    (is (= 6 (factorial 3 product))))
  (testing "Recursive acc sum test"
    (is (= 3.139592655589783 (* 8 (pi-sum 1 1000 sum))))))

(deftest iter-acc-test
  (testing "Iter acc product test"
    (is (= 120 (factorial 5 product-iter)))
    (is (= 6 (factorial 3 product-iter))))
  (testing "Iter acc sum test"
    (is (= 3.139592655589782 (* 8 (pi-sum 1 1000 sum-iter))))))
