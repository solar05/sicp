(ns sicp.chapter01.1-33-test
  (:require [sicp.chapter01.1-33 :refer :all]
            [clojure.test :refer :all]))

(deftest filter-acc-test
  (testing  "Sum of prime squares."
    (is (= 39 (sum-of-prime-squares 1 5)))
    (is (= 1028 (sum-of-prime-squares 1 20))))
  (testing "Product of relative primes."
    (is (= 24 (product-of-relative-primes 5)))
    (is (= 189 (product-of-relative-primes 10)))))
