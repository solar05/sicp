(ns sicp.chapter02.2-36-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-36 :as ch]
            [sicp.test-helper :refer :all]))

(deftest test-accumulate-n
  (let [seqs '((1 2 3) (4 5 6) (7 8 9) (10 11 12))]
    (assert-equal '(22 26 30) (ch/accumulate-n + 0 seqs))))
