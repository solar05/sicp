(ns sicp.chapter02.2-42-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-42 :as ch]
            [sicp.test-helper :refer :all]))

(deftest test-queens
  (assert-equal '((3 1 4 2) (2 4 1 3)) (ch/queens 4))
  (assert-equal 10 (count (ch/queens 5)))
  (assert-equal 4 (count (ch/queens 6)))
  (assert-equal 40 (count (ch/queens 7)))
  (assert-equal 92 (count (ch/queens 8))))
