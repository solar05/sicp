(ns sicp.chapter01.1-12)

(defn pascal-triangle [n k]
  (if (or (= k 0) (= n k))
      1
      (+ (pascal-triangle (- n 1) (- k 1)) (pascal-triangle (- n 1) k))
      )
)
