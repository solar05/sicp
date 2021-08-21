(ns sicp.chapter02.2-22
  (:require [sicp.helper :as h]))

(defn square-list1 [items]
  (loop [things items
         answer nil]
    (if (empty? things)
      answer
      (recur (rest things)
             (concat answer
                     (list (h/square (first things))))))))

(defn square-list2 [items]
  (loop [things items
         answer nil]
    (if (empty? things)
      answer
      (recur (rest things)
             (concat answer
                     (list (h/square (first things))))))))
