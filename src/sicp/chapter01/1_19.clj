(ns sicp.chapter01.1-19)

(defn square [n]
  (* n n))

(defn fib [n]
  (letfn [(fib-iter [a b p q count]
            (cond (zero? count) b
                  (even? count)
                  (fib-iter a
                            b
                            (+ (square p) (square q))
                            (+ (* 2 p q) (square q))
                            (/ count 2))
                  :else (fib-iter (+ (* b q) (* a q) (* a p))
                                  (+ (* b p) (* a q))
                                  p
                                  q
                                  (dec count))))]
    (fib-iter 1 0 0 1 n)))



