(ns sicp.chapter02.2-30
  (:require [sicp.helper :as h]))

(defn square-tree [tree]
  (letfn [(square-node [node]
            (if (list? node)
              (square-tree node)
              (h/square node)))]
    (map square-node tree)))
