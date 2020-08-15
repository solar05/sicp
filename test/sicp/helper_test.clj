(ns sicp.helper-test
  (:require [clojure.test :refer :all]
            [sicp.helper :as helper]))

(deftest helper-test
  (testing "Square test."
    (is (= 4 (helper/square 2)))
    (is (= 16 (helper/square 4))))
  (testing "Cube test."
    (is (= 8 (helper/cube 2)))
    (is (= 64 (helper/cube 4)))))
