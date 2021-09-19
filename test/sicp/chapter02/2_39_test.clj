(ns sicp.chapter02.2-39-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-39 :as ch]
            [sicp.test-helper :refer :all]))

(deftest test-reverse-left
  (assert-equal '() (ch/reverse-left '()))
  (assert-equal '(6 5 4 3 2 1) (ch/reverse-left '(1 2 3 4 5 6))))

(deftest test-reverse-right
  (assert-equal '() (ch/reverse-right '()))
  (assert-equal '(6 5 4 3 2 1) (ch/reverse-right '(1 2 3 4 5 6))))
