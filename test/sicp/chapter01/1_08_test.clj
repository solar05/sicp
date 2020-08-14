(ns sicp.chapter01.1-08-test
  (:require [sicp.chapter01.1-08 :as solution]
            [clojure.test :refer :all]))

(deftest cbrt-test
  (testing "Cbrt test"
    (is (= 4.326748710922225 (solution/cbrt 81)))
    (is (= 2.5198420997897464 (solution/cbrt 16)))
    (is (= 2.924017738212866 (solution/cbrt 25)))))
