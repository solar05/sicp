(ns sicp.chapter02.2-46-test
  (:require [clojure.test :refer [deftest is]]
            [sicp.chapter02.2-46 :as ch]
            [sicp.test-helper :refer [assert-equal]]))

(deftest test-make-vect
  (assert-equal [0 0] (ch/make-vect 0 0))
  (assert-equal [0.5 0.5] (ch/make-vect 0.5 0.5))
  (assert-equal [-1 -2] (ch/make-vect -1 -2)))

(deftest test-add-vect
  (assert-equal [2 3] (ch/add-vect [0 0] [2 3]))
  (assert-equal [1.0 1.0] (ch/add-vect [0.5 0.5] [0.5 0.5]))
  (assert-equal [-2 -4] (ch/add-vect [-1 -2] [-1 -2])))

(deftest test-sub-vect
  (assert-equal [-2 -3] (ch/sub-vect [0 0] [2 3]))
  (assert-equal [0.0 0.0] (ch/sub-vect [0.5 0.5] [0.5 0.5]))
  (assert-equal [0 0] (ch/sub-vect [-1 -2] [-1 -2])))

(deftest test-scale-vect
  (assert-equal [0 0] (ch/scale-vect 1 [0 0]))
  (assert-equal [1.0 1.0] (ch/scale-vect 2 [0.5 0.5]))
  (assert-equal [2 2] (ch/scale-vect -2 [-1 -1])))
