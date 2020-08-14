(ns sicp.chapter01.1-21-test
  (:require [sicp.chapter01.1-21 :refer [smallest-divisor]]
            [clojure.test :refer :all]))

(deftest smallest-divisor-test
  (testing "Result of expr 1-21"
    (is (= 199 (smallest-divisor 199)))
    (is (= 1999 (smallest-divisor 1999)))
    (is (= 7 (smallest-divisor 19999)))))
