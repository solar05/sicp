(ns sicp.chapter02.2-64-test
  (:require [clojure.test :refer [deftest]]
            [sicp.chapter02.2-64 :as ch]
            [sicp.test-helper :refer [assert-equal]]))

(deftest test-partial-tree
  (assert-equal '(5 (1 () (3 () ())) (9 (7 () ()) (11 () ())))
                (ch/list->tree '(1 3 5 7 9 11))))
