(ns sicp.chapter02.2-28-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-28 :refer :all]
            [sicp.test-helper :refer :all]))

(deftest test-fringe
  (let [x '((1 2) (3 4))]
    (assert-equal '() (fringe '()))
    (assert-equal '(1 2 3 4) (fringe x))
    (assert-equal '(1 2 3 4 1 2 3 4) (fringe (list x x)))))
