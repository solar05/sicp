(ns sicp.chapter02.2-40-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-40 :as ch]
            [sicp.test-helper :refer :all]))

(deftest test-unique-pairs
  (assert-equal '((2 1) (3 1) (3 2)
                        (4 1) (4 2) (4 3)
                        (5 1) (5 2) (5 3) (5 4))
                (ch/unique-pairs 5)))

(deftest test-prime-sum-pairs
  (assert-equal '((3 2 1) (5 3 2) (5 4 1) (7 4 3) (7 5 2) (7 6 1) (11 6 5))
                (ch/prime-sum-pairs 6)))
