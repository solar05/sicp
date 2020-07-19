(ns sicp.chapter01.1-03-test
  (:require [sicp.chapter01.1-03 :as solution]
            [clojure.test :refer :all]))

(deftest larger-square-test
  (testing "Result of larger square"
           (is (= 25 (solution/larger-square 3 4 2)))
           (is (= 18 (solution/larger-square 3 3 3)))
           (is (= 45 (solution/larger-square 6 3 2)))
           (is (= 41 (solution/larger-square 2 4 5)))))