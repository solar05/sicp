(ns sicp.chapter01.1-35-test
  (:require [clojure.test :refer :all]
            [sicp.chapter01.1-35 :refer :all]))

(deftest test-fixed-point
  (testing "Fixed-point."
    (letfn [(cos [x] (Math/cos x))
            (sum-of-sin-and-cos [x] (+ (Math/sin x) (Math/cos x)))]
      (is (= 0.7390822985224024 (fixed-point cos 1.0)))
      (is (= 1.2587315962971173 (fixed-point sum-of-sin-and-cos 1.0))))))

(deftest test-golden-ration
  (testing "Golden ratio."
    (is (= 1.6180327868852458 (golden-ration)))))
