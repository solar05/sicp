(ns sicp.chapter02.2-68-test
  (:require [clojure.test :refer [deftest is]]
            [sicp.chapter02.2-67-test :refer [tree]]
            [sicp.chapter02.2-68 :as ch]
            [sicp.test-helper :refer [assert-equal]]))

(defonce message '(A D A B B C A))

(deftest test-68-encode
  (assert-equal '(0 1 1 0 0 1 0 1 0 1 1 1 0) (ch/encode tree message))
  (is (thrown? Exception (ch/encode tree '(A B C D E)))))
