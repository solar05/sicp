(ns sicp.chapter01.1-44-test
  (:require [clojure.test :refer :all]
            [sicp.helper :refer [square]]
            [sicp.chapter01.1-44 :refer :all]))

(def dx 0.00001)

(def n 10)

(deftest test-smooth
  (testing "Normal smooth."
    (is (= 9.0 ((smooth square dx) 3)))
    (is (= 25.0 ((smooth square dx) 5)))))

(deftest test-smooth-fold
  (testing "Folded smooth."
    (is (= 9.0 ((smooth-fold square dx n) 3)))
    (is (= 25.0 ((smooth-fold square dx n) 5)))))
