(ns sicp.chapter02.2-23-test
  (:require [clojure.test :refer [deftest]]
            [sicp.chapter02.2-23 :refer :all]
            [sicp.test-helper :refer :all]))

(deftest test-for-each
  (let [counter (atom 0)
        items [1 2 3 4 5]
        length (count items)
        result (for-each (fn [_] (swap! counter inc)) items)]
    (assert-equal @counter length)))
