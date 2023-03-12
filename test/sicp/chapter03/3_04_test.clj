(ns sicp.chapter03.3-04-test
  (:require [clojure.test :refer [deftest]]
            [sicp.chapter03.3-04 :as ch]
            [sicp.test-helper :refer [assert-equal]]))

(deftest test-make-account
  (let [account (ch/make-account 20 'hello)
        results (mapv (fn [_] ((account 'hey 'deposit) 10)) (range 0 8))]
    (assert-equal "Incorrect password!" (results 0))
    (assert-equal "Incorrect password!" (results 6))
    (assert-equal "FBI, open up!" (results 7))))
