(ns sicp.chapter02.2-39
  (:require [sicp.chapter02.2-38 :as ch]
            [sicp.helper :as h]))

(def fold-left ch/fold-left)

(def fold-right h/acc)

(defn reverse-left [coll]
  (fold-left conj '() coll))

(defn reverse-right [coll]
  (fold-right #(concat %2 (list %1)) '() coll))
