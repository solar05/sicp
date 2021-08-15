(ns sicp.chapter02.2-21-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-21 :refer :all]
            [sicp.test-helper :refer :all]))

(deftest test-square-list
  (assert-equal '(1 4 9 16) (square-list1 [1 2 3 4]))
  (assert-equal '(1 4 9 16) (square-list2 [1 2 3 4])))
