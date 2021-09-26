(ns sicp.chapter02.2-45-test
  (:require [clojure.test :refer [deftest function?]]
            [sicp.chapter02.2-45 :as ch]
            [sicp.test-helper :refer [assert-true]]))

(deftest test-right-split
  (assert-true (function? (ch/right-split identity 1)))
  (assert-true (function? (ch/right-split identity 2))))

(deftest test-upsplit
  (assert-true (function? (ch/up-split identity 1)))
  (assert-true (function? (ch/up-split identity 2))))
