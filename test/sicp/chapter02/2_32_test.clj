(ns sicp.chapter02.2-32-test
  (:require [clojure.test :refer :all]
            [sicp.chapter02.2-32 :as ch]
            [sicp.test-helper :refer :all]))

(deftest test-subsets
  (assert-equal '(() (3) (2) (2 3) (1) (1 3) (1 2) (1 2 3))
                (ch/subsets '(1 2 3))))
