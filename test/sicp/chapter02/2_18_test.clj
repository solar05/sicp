(ns sicp.chapter02.2-18-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-18 :refer :all]
            [sicp.test-helper :refer :all]))

(deftest test-last-pair
  (assert-equal '(34 149 72 23) (my-reverse '(23 72 149 34)))
  (assert-equal '() (my-reverse '()))
  (assert-equal '(4 3 2 1) (my-reverse '(1 2 3 4))))

