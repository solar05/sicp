(ns sicp.chapter02.2-62-test
  (:require [clojure.test :refer [deftest]]
            [sicp.chapter02.2-62 :as ch]
            [sicp.test-helper :refer [assert-equal]]))

(deftest test-union-set
  (assert-equal '() (ch/union-set '() '()))
  (assert-equal '(1 2 3 4 5) (ch/union-set '(1 2 3 4 5) '(1 2 3 4 5)))
  (assert-equal '(0 1 2 3 4 5 6 7) (ch/union-set '(1 3 5 7) '(0 2 4 6)))
  (assert-equal '(-4 -3 -2 -1 0 1 2 3 4 5) (ch/union-set '(0 1 2 3 4 5) '(-4 -3 -2 -1))))
