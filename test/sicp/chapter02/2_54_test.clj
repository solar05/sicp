(ns sicp.chapter02.2-54-test
  (:require [clojure.test :refer [deftest]]
            [sicp.chapter02.2-54 :as ch]
            [sicp.test-helper :refer [assert-equal]]))

(deftest test-equal?
  (assert-equal true (ch/equal? '() '()))
  (assert-equal true (ch/equal? '(1) '(1)))
  (assert-equal true (ch/equal? '(nil) '(nil)))
  (assert-equal true (ch/equal? '(1 2 3) '(1 2 3)))
  (assert-equal true (ch/equal? '(:a \b "c" d) '(:a \b "c" d)))
  (assert-equal false (ch/equal? '() '(1)))
  (assert-equal false (ch/equal? '() '(nil)))
  (assert-equal false (ch/equal? '(nil) '(nil nil)))
  (assert-equal false (ch/equal? '(1 2 3) '(2 3 1)))
  (assert-equal false (ch/equal? '(1 (2 3)) '(1 2 3))))
