(ns sicp.chapter02.2-27
  (:require [sicp.chapter02.2-18 :as r]))

(defn deep-reverse [items]
  (if (or (list? items) (vector? items))
    (map deep-reverse (r/my-reverse items))
    items))
