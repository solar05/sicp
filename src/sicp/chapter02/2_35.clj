(ns sicp.chapter02.2-35)

(defn leaves-count [tree]
  (let [traverse-fn #(if (list? %) (leaves-count %) 1)]
    (->> tree
         (map traverse-fn)
         (reduce + 0))))
