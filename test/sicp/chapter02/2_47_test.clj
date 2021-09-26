(ns sicp.chapter02.2-47-test
  (:require [clojure.test :refer [deftest]]
            [sicp.chapter02.2-47 :as ch]
            [sicp.test-helper :refer [assert-equal]]))

(deftest test-make-frame
  (assert-equal '([0 0] [1 1] [2 2]) (ch/make-frame [0 0] [1 1] [2 2])))

(defonce frame (ch/make-frame [0 0] [1 1] [2 2]))

(deftest test-origin-frame
  (assert-equal [0 0] (ch/origin-frame frame)))

(deftest test-edge1-frame
  (assert-equal [1 1] (ch/edge1-frame frame)))

(deftest test-edge2-frame
  (assert-equal [2 2] (ch/edge2-frame frame)))
