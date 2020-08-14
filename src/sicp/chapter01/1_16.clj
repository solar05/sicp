(ns sicp.chapter01.1-16)

(defn square [x]
  (* x x))

(defn fast-expt [b n]
  (letfn [(iter-expt [b n a]
     (cond (= n 0) a
           (even? n) (iter-expt (square b) (/ n 2) a)
           :else (iter-expt b (- n 1) (* a b))))]
   (iter-expt b n 1)))



