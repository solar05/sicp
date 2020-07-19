(ns sicp.chapter01.1-19-test
  (:require [sicp.chapter01.1-19 :as solution]
            [clojure.test :refer :all]))

(deftest fib-test
  (testing "1_19 test"
           (is (= 5 (solution/fib 5)))
           (is (= 55 (solution/fib 10)))
           (is (= 610 (solution/fib 15)))
           (is (= 6765 (solution/fib 20)))))
