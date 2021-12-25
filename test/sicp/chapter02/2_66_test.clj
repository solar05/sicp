(ns sicp.chapter02.2-66-test
  (:require [clojure.test :refer [deftest]]
            [sicp.chapter02.2-64 :as ch4]
            [sicp.chapter02.2-66 :as ch6]
            [sicp.test-helper :refer [assert-equal]]))

(deftest test-lookup
  (let [records '({:id 2 :data 22}
                  {:id 3 :data 33}
                  {:id 11 :data 111})
        tree (->> records
                  (sort-by :id)
                  ch4/list->tree)]
    (assert-equal nil (ch6/lookup 10 tree))
    (assert-equal {:id 3 :data 33} (ch6/lookup 3 tree))
    (assert-equal {:id 2 :data 22} (ch6/lookup 2 tree))
    (assert-equal {:id 11 :data 111} (ch6/lookup 11 tree))))
