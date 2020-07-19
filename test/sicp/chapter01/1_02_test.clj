(ns sicp.chapter01.1-02-test
  (:require [sicp.chapter01.1-02 :as solution]
            [clojure.test :refer :all]))

(deftest b-test
  (testing "Result" (is (= -37/150 (solution/result)))))