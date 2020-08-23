(ns sicp.chapter01.1-31-test
  (:require [sicp.chapter01.1-31 :refer :all]
            [clojure.test :refer :all]))

(defn pi-term [n]
  (if (even? n)
    (/ (+ n 2) (inc n))
    (/ (inc n) (+ n 2))))

(deftest factorial-test
  (testing  "Factorial 1.31 test"
    (is (= 120 (factorial 5)))
    (is (= 6 (factorial 3))))
  (testing "Factorial iter 1.31 test"
    (is (= 120 (factorial-iter 5)))
    (is (= 6 (factorial-iter 3))))
  (testing  "Pi approximation by John Wallis` formula 1.31 test"
    (is (= 4096/1225 (* (product pi-term 1 inc 6) 4)))))
