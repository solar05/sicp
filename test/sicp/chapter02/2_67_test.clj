(ns sicp.chapter02.2-67-test
  (:require [clojure.test :refer [deftest]]
            [sicp.chapter02.2-67 :as ch]
            [sicp.test-helper :refer [assert-equal]]))

(defonce tree
  (->> (ch/make-leaf 'C 1)
       (ch/make-code-tree (ch/make-leaf 'D 1))
       (ch/make-code-tree (ch/make-leaf 'B 2))
       (ch/make-code-tree (ch/make-leaf 'A 4))))

(defonce message '(0 1 1 0 0 1 0 1 0 1 1 1 0))

(deftest test-tree-decode
  (assert-equal '(A D A B B C A) (ch/decode message tree)))
