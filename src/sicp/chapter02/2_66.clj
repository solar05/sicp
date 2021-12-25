(ns sicp.chapter02.2-66)

(defn lookup [key set-of-records]
  (loop [[{id :id :as entry} l-branch r-branch :as tree] set-of-records]
    (cond (empty? tree) nil
          (= key id) entry
          (< key id) (recur l-branch)
          :else (recur r-branch))))
