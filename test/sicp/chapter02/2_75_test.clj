(ns sicp.chapter02.2-75-test
  (:require [clojure.test :refer [deftest]]
            [sicp.chapter02.2-75 :as ch]
            [sicp.test-helper :refer [assert-equal]]))

(deftest test-make-from-real-imag
  (let [num (ch/make-from-real-imag 2 5)]
    (assert-equal 2 (ch/real-part num))
    (assert-equal 5 (ch/imag-part num))
    (assert-equal 5.3851648071345040 (ch/magnitude num))
    (assert-equal 1.1902899496825317 (ch/angle num))))

(deftest test-make-from-mag-ang
  (let [num (ch/make-from-mag-ang 5.38 1.19)]
    (assert-equal 2.0 (Math/ceil (ch/real-part num)))
    (assert-equal 5.0 (Math/ceil (ch/imag-part num)))
    (assert-equal 5.38 (ch/magnitude num))
    (assert-equal 1.19 (ch/angle num))))
