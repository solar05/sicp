(ns sicp.chapter02.2-38-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-38 :as ch]
            [sicp.test-helper :refer :all]))

(deftest test-fold-left
  (assert-equal 1/6 (ch/fold-left / 1 (list 1 2 3)))
  (assert-equal '(((nil 1) 2) 3) (ch/fold-left list nil (list 1 2 3))))
