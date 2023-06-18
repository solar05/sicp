(ns sicp.chapter03.3-17-test
  (:require [clojure.test :refer :all]
            [sicp.pairs :as p]
            [sicp.chapter03.3-17 :as ch]))

(deftest test-count-pairs
  (let [a (p/cons 3 (p/cons 2 (p/cons 1 nil)))
        b (p/cons 5 (p/cons 4 a))]
    (is (= 3 (ch/count-pairs a)))
    (is (= 5 (ch/count-pairs b)))))
