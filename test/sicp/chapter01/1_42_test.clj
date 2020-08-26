(ns sicp.chapter01.1-42-test
  (:require [clojure.test :refer :all]
            [sicp.helper :refer [square]]
            [sicp.chapter01.1-42 :refer :all]))

(deftest test-compose
  (testing "Function composition."
    (is (= 121 ((compose square inc) 10)))))
