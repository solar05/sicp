(ns sicp.chapter02.2-05)

(defn iter-div [n d i]
  (if (zero? (rem n d))
    (iter-div (/ n d) d (inc i))
    i))

(defn my-cons [x y]
  (* (Math/pow 2 x) (Math/pow 3 y)))

(defn my-car [z]
  (iter-div z 2 0))

(defn my-cdr [z]
  (iter-div z 3 0))
