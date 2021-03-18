(ns sicp.chapter02.2-05-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-05 :refer :all]
            [sicp.test-helper :refer :all]))

(def pair (cons 2 3))

(deftest test-cons-2
  (assert-equal 2 (car pair))
  (assert-equal 3 (cdr pair)))
