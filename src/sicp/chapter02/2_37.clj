(ns sicp.chapter02.2-37)

(defn dot-product [v w]
  (reduce + (map * v w)))

(defn matrix-x-vector [m v]
  (map #(dot-product % v) m))

(defn transpose [m]
  (apply map list m))

(defn matrix-x-matrix [m n]
  (let [cols (transpose n)]
    (map #(matrix-x-vector n %) m)))
