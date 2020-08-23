(ns sicp.helper-test
  (:require [clojure.test :refer :all]
            [sicp.helper :as helper]))

(defn pi-sum [a b]
  (letfn [(pi-term [x] (/ 1.0 (* x (+ x 2))))
          (pi-next [x] (+ x 4))]
    (helper/sum pi-term a pi-next b)))

(deftest helper-test
  (testing "Square test."
    (is (= 4 (helper/square 2)))
    (is (= 16 (helper/square 4))))
  (testing "Cube test."
    (is (= 8 (helper/cube 2)))
    (is (= 64 (helper/cube 4))))
  (testing "GCD test."
    (is (= 1 (helper/gcd 5 98)))
    (is (= 4 (helper/gcd 4 16))))
  (testing "Sum test."
    (is (= 3.139592655589783 (* 8 (pi-sum 1 1000))))))

