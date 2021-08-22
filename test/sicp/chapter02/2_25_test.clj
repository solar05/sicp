(ns sicp.chapter02.2-25-test
  (:require [clojure.test :refer [deftest]]
            [sicp.test-helper :refer [assert-equal]]))

(deftest test-for-car-cdr-combinations
  (let [first-example '(1 3 '(5 7) 9)
        second-example '('(7))
        third-example '(1 '(2 '(3 '(4 '(5) '(6 7)))))
        target 7]
    (assert-equal target (last (last (first (rest (rest first-example))))))
    (assert-equal target (ffirst (rest (first second-example))))
    (assert-equal target (last (last (last (last (last (last (last (last (last third-example))))))))))))
