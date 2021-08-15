(ns sicp.chapter02.2-20-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-20 :refer [same-parity]]
            [sicp.test-helper :refer :all]))

(deftest test-same-parity
  (assert-equal [2 4 6] (same-parity 2 3 4 5 6 7))
  (assert-equal [1 3 5 7] (same-parity 1 2 3 4 5 6 7))
  (assert-equal [1] (same-parity 1)))
