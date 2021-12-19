(ns sicp.chapter02.2-58-test
  (:require [clojure.test :refer [deftest]]
            [sicp.chapter02.2-58 :as ch]
            [sicp.test-helper :refer [assert-equal]]))

(deftest test-deriv-third
  (assert-equal 1 (ch/deriv '(x + 3) 'x))
  (assert-equal 4 (ch/deriv '(x + (3 * (x + (y + 2)))) 'x))
  (assert-equal 4 (ch/deriv '(x + 3 * (x + y + 2)) 'x)))
