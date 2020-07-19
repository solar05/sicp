(ns sicp.chapter01.1-02)

(def num (+ 5 4 (- 2 (- 3 (+ 6 (/ 4 5))))))
(def denom (* 3 (- 6 2) (- 2 7)))
(defn result [] (/ num denom))