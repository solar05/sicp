(ns sicp.chapter01.1-04-test
  (:require [sicp.chapter01.1-04 :as solution]
            [clojure.test :refer :all]))

(deftest abs-test
  (testing "Abs testing"
           (is (= 15 (solution/a-plus-abs-b 5 -10)))
           (is (= 20 (solution/a-plus-abs-b 5 15)))))
