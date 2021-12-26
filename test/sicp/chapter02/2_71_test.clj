(ns sicp.chapter02.2-71-test
  (:require [clojure.string :refer [join]]
            [clojure.test :refer [deftest]]
            [sicp.chapter02.2-68 :as ch8]
            [sicp.chapter02.2-71 :as ch]
            [sicp.test-helper :refer [assert-equal]]))

(deftest test-exp-frequency-tree
  (let [n05-tree (ch/exp-frequency-huffman-tree 05)
        n10-tree (ch/exp-frequency-huffman-tree 10)]
    (assert-equal "1" (join (ch8/encode n05-tree '(E))))
    (assert-equal "1" (join (ch8/encode n10-tree '(J))))
    (assert-equal "0000" (join (ch8/encode n05-tree '(A))))
    (assert-equal "000000000" (join (ch8/encode n10-tree '(A))))))
