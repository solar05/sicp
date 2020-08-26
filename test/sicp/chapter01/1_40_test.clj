(ns sicp.chapter01.1-40-test
  (:require [clojure.test :refer :all]
            [sicp.chapter01.1-40 :refer :all]))

(deftest test-newton-method
  (testing "Newton's method."
    (is (= 2.00000000001201 (newton-method (cubic 4 -19 19 6) 1)))
    (is (= 2.000000000036784 (newton-method (cubic 1 0 0 -8) 1)))))
