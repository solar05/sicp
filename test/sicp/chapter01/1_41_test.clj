(ns sicp.chapter01.1-41-test
  (:require [clojure.test :refer :all]
            [sicp.chapter01.1-41 :refer :all]))

(deftest test-double-func
  (testing "Double function."
    (is (= 26 (((double-func (double-func double-func)) inc) 10)))))
