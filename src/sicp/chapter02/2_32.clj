(ns sicp.chapter02.2-32)

(defn subsets [elems]
  (if (empty? elems)
    (list '())
    (let [tail (subsets (rest elems))]
      (concat tail (map #(cons (first elems) %) tail)))))
