(ns sicp.chapter03.3-05-test
  (:require [clojure.test :refer :all]
            [clojure.test.check.clojure-test :as ct]
            [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as prop]
            [sicp.chapter03.3-05 :as ch]))

(defn approximately-equal [x y accuracy]
  (< (Math/abs (- x y)) accuracy))

(deftest test-estimate-integral
  (is (ch/estimate-integral (ch/circle 5 7 3) 2 4 8 10 10000))
  (is (ch/estimate-pi 10000)))

(ct/defspec spec-estimate-integral
  5
  (prop/for-all [integral (gen/fmap #(ch/estimate-integral (ch/circle 5 7 3) 2 4 8 10 %)
                                    (gen/return 1000))]
                (approximately-equal integral (* (Math/PI) 9) 1.3)))

(ct/defspec spec-estimate-pi
  5
  (prop/for-all [pi (gen/fmap ch/estimate-pi (gen/return 1000))]
                (approximately-equal pi Math/PI 0.2)))
