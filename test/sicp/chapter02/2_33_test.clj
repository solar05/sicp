(ns sicp.chapter02.2-33-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-33 :as ch]
            [sicp.test-helper :refer :all]))

(deftest test-my-map
  (assert-equal [2 3 4 5] (ch/my-map inc '(1 2 3 4))))

(deftest test-append
  (assert-equal '(1 2 3 4) (ch/append '(1 2) '(3 4))))

(deftest test-length
  (assert-equal 5 (ch/length '(1 2 3 4 5))))
