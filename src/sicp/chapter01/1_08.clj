(ns sicp.chapter01.1-08)

(defn square [x] (* x x))

(defn improve [guess x]
  (/ (+ (/ x (square guess)) (* 2 guess)) 3))

(defn good-enough? [guess x]
  (= (improve guess x) guess))

(defn cbrt-iter [guess x]
  (if (good-enough? guess x) guess (cbrt-iter (improve guess x) x)))

(defn cbrt [x] (cbrt-iter 0.1 x))