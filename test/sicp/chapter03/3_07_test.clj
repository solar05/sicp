(ns sicp.chapter03.3-07-test
  (:require [clojure.test :refer :all]
            [sicp.chapter03.3-03 :refer [make-account]]
            [sicp.chapter03.3-07 :refer [make-joint]]))

(deftest test-make-joint
  (let [peter-acc (make-account 100 'open-sesame)
        paul-acc  (make-joint peter-acc 'open-sesame 'rosebud)]
    (is (= 70 ((peter-acc 'open-sesame 'withdraw) 30)))
    (is (= "Incorrect password!" ((peter-acc 'rosebud 'withdraw) 40)))
    (is (= 70 ((peter-acc 'open-sesame 'withdraw) 0)))
    (is (= 70 ((paul-acc  'rosebud 'withdraw) 0)))
    (is (= 40 ((paul-acc  'rosebud 'withdraw) 30)))
    (is (= "Incorrect password!" ((paul-acc  'open-sesame 'withdraw) 40)))
    (is (= 40 ((peter-acc 'open-sesame 'withdraw) 0)))))
