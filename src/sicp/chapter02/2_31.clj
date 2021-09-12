(ns sicp.chapter02.2-31
  (:require [sicp.helper :as h]))

(defn tree-map [fun tree]
  (letfn [(process-node [node]
            (if (list? node)
              (tree-map fun node)
              (fun node)))]
    (map process-node tree)))

(defn square-tree [tree]
  (tree-map h/square tree))
