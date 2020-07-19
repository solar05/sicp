(ns sicp.chapter01.1-17-test
  (:require [sicp.chapter01.1-17 :as solution]
            [clojure.test :refer :all]))

(deftest mult-test
  (testing "1_17 test"
           (is (= 0 (solution/mult 2 0)))
           (is (= 0 (solution/mult 0 0)))
           (is (= -96 (solution/mult -32 3)))
           (is (= 8 (solution/mult 2 4)))
           (is (= 81 (solution/mult 9 9)))))
