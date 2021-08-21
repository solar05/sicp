(ns sicp.chapter02.2-23)

(defn for-each [fun items]
  (loop [item items]
    (when (seq item)
      (fun (first item))
      (recur (rest item)))))
