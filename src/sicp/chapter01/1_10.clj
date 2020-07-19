(ns sicp.chapter01.1-10)

(defn A [x y]
  (cond (= y 0) 0
        (= x 0) (* 2 y)
        (= y 1) 2
        :else (A (- x 1) (A x (- y 1)))))

;(f n) = 2n
;(g n) = 2^n
;(h n) = 2^2^2^2^....(the number of 2s is n)
;(k n) = 5n^2