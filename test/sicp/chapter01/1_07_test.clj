(ns sicp.chapter01.1-07-test
  (:require [sicp.chapter01.1-07 :as solution]
            [clojure.test :refer :all]))

(deftest sqrt-test
  (testing "Sqrt test"
    (is (= 3.001177289789316 (solution/sqrt 9)))
    (is (= 4.000022027401167 (solution/sqrt 16)))
    (is (= 5.000356653832537 (solution/sqrt 25)))))
