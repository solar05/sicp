(ns sicp.chapter02.2-27-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-27 :refer :all]
            [sicp.test-helper :refer :all]))

(deftest test-deep-reverse
  (assert-equal [34 149 [3 2 1] 23] (deep-reverse [23 [1 2 3] 149 34]))
  (assert-equal '() (deep-reverse '()))
  (assert-equal [4 3 [[3 2 1] 2 1] 1] (deep-reverse [1 [1 2 [1 2 3]] 3 4])))

