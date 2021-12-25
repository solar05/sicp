(ns sicp.chapter02.2-65-test
  (:require [clojure.test :refer [deftest]]
            [sicp.chapter02.2-64 :as ch4]
            [sicp.chapter02.2-65 :as ch5]
            [sicp.test-helper :refer [assert-equal]]))

(deftest test-tree-union-set
  (assert-equal '() (ch5/union-set (ch4/list->tree '())
                                   (ch4/list->tree '())))

  (assert-equal '(3 (1 () (2 () ())) (4 () (5 () ())))
                (ch5/union-set (ch4/list->tree '(1 2 3 4 5))
                               (ch4/list->tree '(1 2 3 4 5))))

  (assert-equal '(3 (1 (0 () ()) (2 () ())) (5 (4 () ()) (6 () (7 () ()))))
                (ch5/union-set (ch4/list->tree '(1 3 5 7))
                               (ch4/list->tree '(0 2 4 6))))

  (assert-equal '(0 (-3 (-4 () ()) (-2 () (-1 () ()))) (3 (1 () (2 () ())) (4 () (5 () ()))))
                (ch5/union-set (ch4/list->tree '(0 1 2 3 4 5))
                               (ch4/list->tree '(-4 -3 -2 -1)))))

(deftest test-tree-intersection-set
  (assert-equal '()
                (ch5/intersection-set (ch4/list->tree '())
                                      (ch4/list->tree '())))

  (assert-equal '(3 (1 () ()) (4 () ()))
                (ch5/intersection-set (ch4/list->tree '(1 3 4 5))
                                      (ch4/list->tree '(1 3 4)))))
