(ns sicp.chapter01.1-10-test
  (:require [sicp.chapter01.1-10 :as solution]
            [clojure.test :refer :all]))

(deftest A-test
  (testing "1_10 test"
    (is (= 1024 (solution/A 1 10)))
    (is (= 65536 (solution/A 2 4)))
    (is (= 65536 (solution/A 3 3)))))

