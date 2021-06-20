(ns sicp.chapter02.2-17-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-17 :refer :all]
            [sicp.test-helper :refer :all]))

(deftest test-last-pair
  (assert-equal (list 34) (last-pair (list 23 72 149 34)))
  (assert-equal (list) (last-pair (list))))

