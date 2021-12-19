(ns sicp.chapter02.2-57-test
  (:require [clojure.test :refer [deftest]]
            [sicp.chapter02.2-57 :as ch]
            [sicp.test-helper :refer [assert-equal]]))

(deftest test-deriv-second
  (assert-equal 1 (ch/deriv '(+ x 3) 'x))
  (assert-equal 'y (ch/deriv '(* x y) 'x))
  (assert-equal '(+ 2 3 y) (ch/deriv '(+ (* 2 x) (* 3 x) (* x y)) 'x))
  (assert-equal '(+ (* x y) (* x y)) (ch/deriv '(* x x y) 'x))
  (assert-equal '(+ (* x y) (* y (+ x 3))) (ch/deriv '(* x y (+ x 3)) 'x)))
