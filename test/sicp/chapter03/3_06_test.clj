(ns sicp.chapter03.3-06-test
  (:require [clojure.test :refer :all]
            [sicp.chapter03.3-06 :as ch]))

(deftest test-my-rand
  (is (zero? ((ch/my-rand :reset) 0)))
  (is (= 1 (ch/my-rand :generate)))
  (is (= 2 (ch/my-rand :generate)))
  (is (= 7 ((ch/my-rand :reset) 7)))
  (is (= 8 (ch/my-rand :generate)))
  (is (= 9 (ch/my-rand :generate)))
  (is (zero? ((ch/my-rand :reset) 0))))
