(ns sicp.chapter02.2-60-test
  (:require [clojure.test :refer [deftest]]
            [sicp.chapter02.2-60 :as ch]
            [sicp.test-helper :refer [assert-equal]]))

(deftest test-adjoin-set-second
  (assert-equal '(1 2 3) (ch/adjoin-set 1 '(2 3)))
  (assert-equal '(1 1 2 3) (ch/adjoin-set 1 '(1 2 3)))
  (assert-equal '(nil) (ch/adjoin-set nil '()))
  (assert-equal '(()) (ch/adjoin-set '() '())))

(deftest test-element-of-set?-second
  (assert-equal true (ch/element-of-set? 1 '(1)))
  (assert-equal true (ch/element-of-set? 3 '(1 2 3 4)))
  (assert-equal true (ch/element-of-set? '(2 3) '(1 (2 3) 4)))
  (assert-equal false (ch/element-of-set? nil '()))
  (assert-equal false (ch/element-of-set? '() '(nil)))
  (assert-equal false (ch/element-of-set? '() '()))
  (assert-equal false (ch/element-of-set? 3 '(1 (2 3) 4))))

(deftest test-intersection-set-canonical
  (assert-equal '() (ch/intersection-set-canonical '() '()))
  (assert-equal '(4 1 3) (ch/intersection-set-canonical '(4 1 5 3) '(1 3 4)))
  (assert-equal '(1 3 3 1 1) (ch/intersection-set-canonical '(1 2 3 3 1 1) '(1 1 3 3 3 4))))

(deftest test-intersection-set-functional
  (assert-equal '() (ch/intersection-set-functional '() '()))
  (assert-equal '(4 1 3) (ch/intersection-set-functional '(4 1 5 3) '(1 3 4)))
  (assert-equal '(1 3 3 1 1) (ch/intersection-set-functional '(1 2 3 3 1 1) '(1 1 3 3 3 4))))

(deftest test-union-set-second
  (assert-equal '() (ch/union-set '() '()))
  (assert-equal '(nil) (ch/union-set '() '(nil)))
  (assert-equal '(nil) (ch/union-set '(nil) '()))
  (assert-equal '(nil nil) (ch/union-set '(nil) '(nil)))
  (assert-equal '(1 2 3) (ch/union-set '(1 2) '(3)))
  (assert-equal '(1 2 1 2 3 1 2) (ch/union-set '(1 2) '(1 2 3 1 2)))
  (assert-equal '(1 2 3 1 2 1 2) (ch/union-set '(1 2 3 1 2) '(1 2)))
  (assert-equal '(1 2 3 4 (1) (2) 3) (ch/union-set '(1 2 3 4) '((1) (2) 3))))
