(ns sicp.chapter02.2-74-test
  (:require [clojure.test :refer [deftest]]
            [sicp.chapter02.2-74 :as ch]
            [sicp.test-helper :refer [assert-true assert-false assert-equal]]))

(defonce engineering-package (ch/install-engineering-department))

(defonce sales-package (ch/install-sales-department))

(deftest test-get-record
  (assert-true (ch/get-record 'engineering 'Hugo))
  (assert-true (ch/get-record 'engineering 'Alyssa))
  (assert-true (ch/get-record 'engineering 'Ben))
  (assert-true (ch/get-record 'engineering 'Eva))
  (assert-true (ch/get-record 'sales 'Mike))
  (assert-true (ch/get-record 'sales 'Jennifer))
  (assert-true (ch/get-record 'sales 'Scott))
  (assert-false (ch/get-record 'engineering 'Mike))
  (assert-false (ch/get-record 'sales 'Hugo)))

(deftest test-get-salary
  (assert-equal 60000  (ch/get-salary 'engineering 'Hugo))
  (assert-equal 90000  (ch/get-salary 'engineering 'Alyssa))
  (assert-equal 110000 (ch/get-salary 'engineering 'Ben))
  (assert-equal 100000 (ch/get-salary 'engineering 'Eva))
  (assert-equal 200000 (ch/get-salary 'sales 'Mike))
  (assert-equal 180000 (ch/get-salary 'sales 'Jennifer))
  (assert-equal 250000 (ch/get-salary 'sales 'Scott)))

(deftest test-find-employee-record
  (assert-true (ch/find-employee-record ['engineering 'sales] 'Hugo))
  (assert-true (ch/find-employee-record ['engineering 'sales] 'Mike))
  (assert-false (ch/find-employee-record ['engineering 'sales] 'Bob)))
