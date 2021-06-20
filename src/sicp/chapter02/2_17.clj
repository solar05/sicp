(ns sicp.chapter02.2-17)

(defn last-pair [elements]
  (if (empty? elements)
    (list)
    (loop [[head & tail] elements]
      (if (empty? tail)
        (list head)
        (recur tail)))))
