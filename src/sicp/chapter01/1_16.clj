(ns sicp.chapter01.1-16)

(defn square [x]
  (* x x))

(defn fast-expt [b n]
  (letfn [(iter-expt [b n a]
            (cond (zero? n) a
                  (even? n) (iter-expt (square b) (/ n 2) a)
                  :else (iter-expt b (dec n) (* a b))))]
    (iter-expt b n 1)))



