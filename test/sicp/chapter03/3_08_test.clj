(ns sicp.chapter03.3-08-test
  (:require [clojure.test :refer :all]
            [sicp.chapter03.3-08 :as ch]))

(deftest test-fold-left
  (let [f (ch/make-f)]
    (is (zero? (+ (f 0) (f 1))))))

(deftest test-fold-right
  (let [f (ch/make-f)]
    (is (= 1 (+ (f 1) (f 0))))))
