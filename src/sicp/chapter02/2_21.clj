(ns sicp.chapter02.2-21
  (:require [sicp.helper :as h]))

(defn square-list1 [items]
  (when (seq items)
    (cons (h/square (first items))
          (square-list1 (rest items)))))

(defn square-list2 [items]
  (map h/square items))
