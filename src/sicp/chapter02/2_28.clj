(ns sicp.chapter02.2-28)

(defn fringe [tree]
  (loop [node tree
         acc nil]
    (let [x (first node)]
      (cond (empty? node) (reverse acc)
            (list? x) (recur (concat x (rest node))
                             acc)
            :else (recur (rest node)
                         (cons x acc))))))
