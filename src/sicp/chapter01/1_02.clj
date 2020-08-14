(ns sicp.chapter01.1-02)

(def numer (+ 5 4 (- 2 (- 3 (+ 6 (/ 4 5))))))
(def denom (* 3 (- 6 2) (- 2 7)))
(defn result [] (/ numer denom))
