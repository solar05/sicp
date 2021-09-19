(ns sicp.chapter02.2-37-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-37 :as ch]
            [sicp.test-helper :refer :all]))

(deftest test-dot-product
  (assert-equal 32 (ch/dot-product '(1 2 3) '(4 5 6))))

(deftest test-matrix-x-vector
  (assert-equal '(17 39) (ch/matrix-x-vector '((1 2) (3 4)) '(5 6))))

(deftest test-transpose
  (assert-equal '((1 4 7) (2 5 8) (3 6 9))
                (ch/transpose '((1 2 3) (4 5 6) (7 8 9)))))

(deftest test-matrix-x-matrix
  (assert-equal '((23 230) (230 2300))
                (ch/matrix-x-matrix '((2 3) (20 30))
                                    '((4 5) (40 50)))))
