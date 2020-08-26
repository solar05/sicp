(ns sicp.chapter01.1-46-test
  (:require [clojure.test :refer :all]
            [sicp.helper :refer [round]]
            [sicp.chapter01.1-46 :refer :all]))

(deftest test-sqrt
  (testing "Sqrt test."
    (is (= 8.0 (round (sqrt 64) 4)))
    (is (= 16.0 (round (sqrt 256) 4)))))

(deftest test-fixed-point
  (testing "Fixed point."
    (is (= 1.6180371352785146 (fixed-point #(inc (/ 1 %)) 1.0)))))
