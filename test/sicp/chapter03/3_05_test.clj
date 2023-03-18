(ns sicp.chapter03.3-05-test
  (:require [clojure.test :refer :all]
            [sicp.chapter03.3-05 :as ch]))

(deftest test-estimate-integral
  (is (ch/estimate-integral (ch/circle 5 7 3) 2 4 8 10 10000))
  (is (ch/estimate-pi 10000)))
