(ns sicp.chapter02.2-48-test
  (:require [clojure.test :refer [deftest]]
            [sicp.chapter02.2-48 :as ch]
            [sicp.test-helper :refer [assert-equal]]))

(deftest test-make-segment
  (assert-equal [[0 0] [1 1]] (ch/make-segment [0 0] [1 1])))

(defonce segment (ch/make-segment [0 0] [1 1]))

(deftest test-start-segment
  (assert-equal [0 0] (ch/start-segment segment)))

(deftest test-end-segment
  (assert-equal [1 1] (ch/end-segment segment)))
