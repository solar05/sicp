(ns sicp.chapter01.1-03)

(defn square [x] (* x x))
(defn larger-square [x y z] (cond
                                [(and (>= x y) (>= z y)) (+ (square x) (square z))]
                                [(and (>= x y) (>= y z)) (+ (square x) (square y))]
                                [(and (<= x y) (>= z x)) (+ (square y) (square z))]
                                [:else (+ (square x) (square y))]
                                ))