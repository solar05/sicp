(ns sicp.chapter02.2-44-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-44 :as ch]
            [sicp.test-helper :refer :all]))

(deftest test-upsplit
  (assert-true (function? (ch/up-split identity 1)))
  (assert-true (function? (ch/up-split identity 3))))
