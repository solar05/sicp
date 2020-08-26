(ns sicp.chapter01.1-40
  (:require [sicp.chapter01.1-35 :refer [fixed-point]]))

(defn deriv [g]
  (let [dx 0.00001]
    (fn [x] (/ (- (g (+ x dx))
                  (g x))
               dx))))

(defn trans [g]
  (fn [x]
    (- x
       (/ (g x)
          ((deriv g) x)))))

(defn newton-method
  [g guess]
  (fixed-point (trans g) guess))

(defn cubic [a b c d]
  (fn [x] (+ (* a x x x)
             (* b x x)
             (* c x)
             d)))
