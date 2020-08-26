(ns sicp.chapter01.1-43-test
  (:require [clojure.test :refer :all]
            [sicp.helper :refer [square]]
            [sicp.chapter01.1-43 :refer :all]))

(deftest test-repeated
  (testing "Repeated test."
    (is (= 25 ((repeated square 1) 5)))
    (is (= 256 ((repeated square 3) 2)))
    (is (= 625 ((repeated square 2) 5)))))
