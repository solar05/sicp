(ns sicp.chapter02.2-35-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-35 :as ch]
            [sicp.test-helper :refer :all]))

(deftest test-leaves-count
  (assert-equal 0 (ch/leaves-count '()))
  (assert-equal 4 (ch/leaves-count '((1 2) (3 4))))
  (assert-equal 12 (ch/leaves-count '(((1 2) 3 4 (5 6)) ((1 2) 3 4 5 6)))))
