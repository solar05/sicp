(ns sicp.chapter01.1-28-test
  (:require [sicp.chapter01.1-28 :refer :all]
            [clojure.test :refer :all]))

(deftest smallest-divisor-test
  (testing "Result of ex 1-28"
    (is (false? (miller-rabin-prime? 561)))
    (is (false? (miller-rabin-prime? 1105)))
    (is (false? (miller-rabin-prime? 1729)))
    (is (false? (miller-rabin-prime? 2465)))
    (is (false? (miller-rabin-prime? 2821)))
    (is (false? (miller-rabin-prime? 6601)))))
