(ns sicp.chapter01.1-12-test
  (:require [sicp.chapter01.1-12 :as solution]
            [clojure.test :refer :all]))

(deftest pascal-triangle-test
  (testing "1_12 test"
           (is (= 10 (solution/pascal-triangle 5 2)))
           (is (= 6 (solution/pascal-triangle 4 2)))))
