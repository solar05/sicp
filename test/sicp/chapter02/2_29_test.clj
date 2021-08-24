(ns sicp.chapter02.2-29-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-29 :refer :all]
            [sicp.test-helper :refer :all]))

(deftest test-mobiles
  (let [m1 (make-mobile
            (make-branch 4 6)
            (make-branch 5 (make-mobile
                            (make-branch 3 7)
                            (make-branch 9 8))))
        m2 (make-mobile
            (make-branch 4 6)
            (make-branch 2
                         (make-mobile
                          (make-branch 5 8)
                          (make-branch 10 4))))]
    (assert-equal 21 (total-weight m1))
    (assert-equal 18 (total-weight m2))
    (assert-true (balanced? m2))
    (assert-false (balanced? m1))))
