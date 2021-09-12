(ns sicp.chapter02.2-31-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-31 :as ch]
            [sicp.test-helper :refer :all]))

(deftest test-square-tree-v2
  (let [tree '(1 (2 (3 4) 5) (6 (7 8) (9 10)))
        sq-tree '(1 (4 (9 16) 25) (36 (49 64) (81 100)))]
    (assert-equal sq-tree (ch/square-tree tree))))
