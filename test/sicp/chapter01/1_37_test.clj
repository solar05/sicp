(ns sicp.chapter01.1-37-test
  (:require [clojure.test :refer :all]
            [sicp.helper :refer [round]]
            [sicp.chapter01.1-37 :refer :all]))

(deftest test-golden-ratio-approximation
  (testing "Golden ration approximation")
  (is (= 1.6180 (round (golden-ration-approximation 12) 4))))
