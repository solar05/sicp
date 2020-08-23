(ns sicp.chapter01.1-29-test
  (:require [sicp.chapter01.1-29 :refer :all]
            [sicp.helper :refer [cube]]
            [clojure.test :refer :all]))

(deftest simpson-cube
  (testing  "Simpson 1.29 test"
    (is (= 0.25 (simpson-integral cube 0 1 100)))
    (is (= 0.25 (simpson-integral cube 0 1 1000)))))
