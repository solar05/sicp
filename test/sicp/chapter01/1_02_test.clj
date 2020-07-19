(ns sicp.chapter01.1-02-test
  (:require [sicp.chapter01.1-02 :as solution]
            [clojure.test :refer :all]))

(deftest calc-test
  (testing "Result of calc" (is (= -37/150 (solution/result)))))