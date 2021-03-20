(ns sicp.chapter02.2-11-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-11 :refer :all]
            [sicp.test-helper :refer :all]))

(deftest test-interval-mul-complex
  (assert-equal [100 100] (mul-interval
                           (make-interval 10 10)
                           (make-interval 10 10)))
  (assert-equal [0 100] (mul-interval
                         (make-interval 10 10)
                         (make-interval 0 10)))
  (assert-equal [0 0] (mul-interval
                       (make-interval 10 10)
                       (make-interval 0 0)))
  (assert-equal [-100 100] (mul-interval
                            (make-interval 10 10)
                            (make-interval 10 -10)))
  (assert-equal [-100 0] (mul-interval
                          (make-interval 10 10)
                          (make-interval -10 0)))
  (assert-equal [-100 -100] (mul-interval
                             (make-interval 10 10)
                             (make-interval -10 -10))))
