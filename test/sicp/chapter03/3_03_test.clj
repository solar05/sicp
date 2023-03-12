(ns sicp.chapter03.3-03-test
  (:require [clojure.test :refer [deftest]]
            [sicp.chapter03.3-03 :as ch]
            [sicp.test-helper :refer [assert-equal]]))

(deftest test-make-account
  (let [account (ch/make-account 20 'hello)]
    (assert-equal 30 ((account 'hello 'deposit) 10))
    (assert-equal 40 ((account 'hello 'deposit) 10))
    (assert-equal "Incorrect password!" ((account 'pswd 'deposit) 10))
    (assert-equal 20 ((account 'hello 'withdraw) 20))
    (assert-equal 15 ((account 'hello 'withdraw) 5))
    (assert-equal "Not enough money!" ((account 'hello 'withdraw) 20))
    (assert-equal "Incorrect password!" ((account 'pswd 'withdraw) 15))
    (assert-equal 0 ((account 'hello 'withdraw) 15))
    (assert-equal "Not enough money!" ((account 'hello 'withdraw) 20))
    (assert-equal "Incorrect password!" ((account 'pswd 'deposit) 10))
    (assert-equal "Incorrect operation!" ((account 'hello 'dep) 10))))
