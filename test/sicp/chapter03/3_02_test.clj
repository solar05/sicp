(ns sicp.chapter03.3-02-test
  (:require [clojure.test :refer [deftest]]
            [sicp.chapter03.3-02 :as ch]
            [sicp.test-helper :refer [assert-equal]]))

(deftest test-make-accumulator
  (let [A (ch/make-monitored (fn [x] (* x x)))]
    (assert-equal 100 (A 10))
    (assert-equal 4 (A 2))
    (assert-equal 2 (A 'how-many-calls?))
    (assert-equal 0 (A 'reset-count))
    (assert-equal 0 (A 'how-many-calls?))
    (assert-equal 16 (A 4))
    (assert-equal 1 (A 'how-many-calls?))))
