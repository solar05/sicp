(ns sicp.chapter02.2-63-test
  (:require [clojure.test :refer [deftest]]
            [sicp.chapter02.2-63 :as ch]
            [sicp.test-helper :refer [assert-equal]]))

(deftest test-tree->list-first
  (assert-equal '(1 3 5 7 9 11) (ch/tree->list-first '(7 (3 (1) (5)) (9 () (11)))))
  (assert-equal '(1 3 5 7 9 11) (ch/tree->list-first '(3 (1) (7 (5) (9 () (11))))))
  (assert-equal '(1 3 5 7 9 11) (ch/tree->list-first '(5 (3 (1) ()) (9 (7) (11))))))

(deftest test-tree->list-second
  (assert-equal '(1 3 5 7 9 11) (ch/tree->list-second '(7 (3 (1) (5)) (9 () (11)))))
  (assert-equal '(1 3 5 7 9 11) (ch/tree->list-second '(3 (1) (7 (5) (9 () (11))))))
  (assert-equal '(1 3 5 7 9 11) (ch/tree->list-second '(5 (3 (1) ()) (9 (7) (11))))))
