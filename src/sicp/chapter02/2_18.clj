(ns sicp.chapter02.2-18)

(defn my-reverse [elements]
  (loop [el elements
         acc '()]
    (if (empty? el)
      acc
      (recur (rest el)
             (cons (first el) acc)))))
