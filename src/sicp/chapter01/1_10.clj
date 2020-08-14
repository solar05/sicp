(ns sicp.chapter01.1-10)

(defn A [x y]
  (cond (zero? y) 0
        (zero? x) (* 2 y)
        (= y 1) 2
        :else (A (dec x) (A x (dec y)))))

;(f n) = 2n
;(g n) = 2^n
;(h n) = 2^2^2^2^....(the number of 2s is n)
;(k n) = 5n^2
