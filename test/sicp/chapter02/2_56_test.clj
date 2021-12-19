(ns sicp.chapter02.2-56-test
  (:require [clojure.test :refer [deftest]]
            [sicp.chapter02.2-56 :as ch]
            [sicp.helper :as h]
            [sicp.test-helper :refer [assert-equal assert-true]]))

(deftest test-deriv
  (assert-equal 1 (ch/deriv '(+ x 3) 'x))
  (assert-equal 'y (ch/deriv '(* x y) 'x))
  (assert-equal '(+ (* x y) (* y (+ x 3))) (ch/deriv '(* (* x y) (+ x 3)) 'x))
  (assert-equal '(* (* 5 (** (* 3 x) 4)) 3) (ch/deriv '(** (* 3 x) 5) 'x))
  (assert-equal '(* 2 x) (ch/deriv '(** x 2) 'x))
  (assert-true (h/error? (ch/deriv '(! 4 5) 'x))))
