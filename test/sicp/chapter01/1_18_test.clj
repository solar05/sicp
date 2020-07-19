(ns sicp.chapter01.1-18-test
  (:require [sicp.chapter01.1-18 :as solution]
            [clojure.test :refer :all]))

(deftest mul-test
  (testing "1_18 test"
           (is (= 6 (solution/mul 2 3)))
           (is (= 50 (solution/mul 5 10)))
           (is (= 100 (solution/mul 10 10)))
           (is (= 72 (solution/mul 24 3)))))
