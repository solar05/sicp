(ns sicp.chapter02.2-65
  (:require [sicp.chapter02.2-61 :as ch1]
            [sicp.chapter02.2-62 :as ch2]
            [sicp.chapter02.2-63 :as ch3]
            [sicp.chapter02.2-64 :as ch4]))

(defn union-set [s1 s2]
  (ch4/list->tree (ch2/union-set (ch3/tree->list-second s1)
                                             (ch3/tree->list-second s2))))

(defn intersection-set [s1 s2]
  (ch4/list->tree (ch1/intersection-set (ch3/tree->list-second s1)
                                                    (ch3/tree->list-second s2))))
