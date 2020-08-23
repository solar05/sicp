(ns sicp.helper)

(defn square [num] (* num num))

(defn cube [num] (* num num num))

(defn sum [term a next b]
  (if (> a b)
    0
    (+ (term a)
       (sum term (next a) next b))))
