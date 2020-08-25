(ns sicp.chapter01.1-37
  (:require [sicp.helper :refer [round]]))

(defn cont-frac-rec [n d k]
  (letfn [(rec [x]
            (if (> x k)
              0
              (/ (n x) (+ (d x) (rec (inc x))))))]
    (rec 1)))

(defn cont-frac-iter [n d k]
  (letfn [(iter [x result]
            (if (zero? x)
              result
              (iter (dec x) (/ (n x) (+ (d x) result)))))]
    (iter k 0)))

(defn golden-ration-approximation [n]
  (let [one (fn [x] 1.0)]
    (/ 1 (cont-frac-iter one one n))))
