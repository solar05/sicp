(ns sicp.chapter01.1-16-test
  (:require [sicp.chapter01.1-16 :as solution]
            [clojure.test :refer :all]))

(deftest fast-expt-test
  (testing "1_16 test"
           (is (= 4 (solution/fast-expt 2 2)))
           (is (= 8 (solution/fast-expt 2 3)))
           (is (= 16 (solution/fast-expt 2 4)))
           (is (= 32 (solution/fast-expt 2 5)))
           (is (= 64 (solution/fast-expt 2 6)))
           (is (= 128 (solution/fast-expt 2 7)))
           (is (= 256 (solution/fast-expt 2 8)))
           (is (= 512 (solution/fast-expt 2 9)))
           (is (= 1024 (solution/fast-expt 2 10)))
           (is (= 1048576 (solution/fast-expt 2 20)))
           (is (= 27 (solution/fast-expt 3 3)))
           (is (= 256 (solution/fast-expt 4 4)))
           (is (= 3125 (solution/fast-expt 5 5)))
           (is (= 46656 (solution/fast-expt 6 6)))
           (is (= 823543 (solution/fast-expt 7 7)))
           (is (= 16777216 (solution/fast-expt 8 8)))
           (is (= 387420489 (solution/fast-expt 9 9)))))
