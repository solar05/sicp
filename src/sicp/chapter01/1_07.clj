(ns sicp.chapter01.1-07)

(defn average [x y] (/ (+ x y) 2))

(defn improve [guess x]
  (average guess (/ x guess))
)

(defn square [x] (* x x))

(defn good-enough? [guess x]
  (< (Math/abs (- (improve guess x) guess))
     (* guess 0.001)))

(defn sqrt-iter [guess x]
  (if (good-enough? guess x) guess (sqrt-iter (improve guess x) x))
)

(defn sqrt [x] (sqrt-iter 0.1 x))