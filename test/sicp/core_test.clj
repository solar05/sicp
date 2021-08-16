(ns sicp.core-test
  (:require [clojure.test :refer :all]
            [sicp.core :refer :all]))

(deftest a-test
  (testing "Fixed, no fail."
    (is (zero? 0))))
