(ns sicp.chapter01.1-45-test
  (:require [clojure.test :refer :all]
            [sicp.chapter01.1-45 :refer :all]))

(deftest test-nth-root
  (testing "Nth root."
    (is (= 3.0 (nth-root 81 4)))
    (is (= 2.0 (nth-root 256 8)))
    (is (= 2.0 (nth-root 4294967296 32)))))
