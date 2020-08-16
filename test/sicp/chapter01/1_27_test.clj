(ns sicp.chapter01.1-27-test
  (:require [sicp.chapter01.1-27 :refer :all]
            [sicp.chapter01.1-22 :refer [prime?]]
            [clojure.test :refer :all]))

(deftest smallest-divisor-test
  (testing "Result of expr 1-27"
    (is (false? (prime? 561)))
    (is (true? (check-prime 561)))
    (is (false? (prime? 1105)))
    (is (true? (check-prime 1105)))
    (is (false? (prime? 1729)))
    (is (true? (check-prime 1729)))
    (is (false? (prime? 2465)))
    (is (true? (check-prime 2465)))
    (is (false? (prime? 2821)))
    (is (true? (check-prime 2821)))
    (is (false? (prime? 6601)))
    (is (true? (check-prime 6601)))))
