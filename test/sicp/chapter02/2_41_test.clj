(ns sicp.chapter02.2-41-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-41 :as ch]
            [sicp.test-helper :refer :all]))

(deftest test-enumerate-threes
  (assert-equal '() (ch/enum-threes 1))
  (assert-equal '() (ch/enum-threes 2))
  (assert-equal '((1 2 3)) (ch/enum-threes 3))
  (assert-equal '((1 2 3) (1 2 4) (1 3 4) (2 3 4)) (ch/enum-threes 4)))

(deftest test-find-threes
  (assert-equal '((1 3 4) (1 2 5)) (ch/find-threes 5 8))
  (assert-equal '((2 3 4) (1 3 5)) (ch/find-threes 5 9))
  (assert-equal '((2 3 5) (1 4 5)) (ch/find-threes 5 10)))
