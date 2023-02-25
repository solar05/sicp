(ns sicp.helper-test
  (:require [clojure.test :refer :all]
            [sicp.helper :as h]))

(defn pi-sum [a b]
  (letfn [(pi-term [x] (/ 1.0 (* x (+ x 2))))
          (pi-next [x] (+ x 4))]
    (h/sum pi-term a pi-next b)))

(deftest helper-test
  (testing "Square test."
    (is (= 4 (h/square 2)))
    (is (= 16 (h/square 4))))
  (testing "Cube test."
    (is (= 8 (h/cube 2)))
    (is (= 64 (h/cube 4))))
  (testing "GCD test."
    (is (= 1 (h/gcd 5 98)))
    (is (= 4 (h/gcd 4 16))))
  (testing "Average test"
    (is (= 1.0 (h/avg [1 1 1])))
    (is (= 3.0 (h/avg [1 2 3 4 5]))))
  (testing "Sum test."
    (is (= 3.139592655589783 (* 8 (pi-sum 1 1000))))))
