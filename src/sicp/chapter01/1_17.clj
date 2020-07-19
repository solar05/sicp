(ns sicp.chapter01.1-17)

(defn double [x]
  (+ x x))

(defn halve [x]
  (/ x 2))

(defn mult [a b]
  (cond (= b 0) 0
        (even? b) (mult (double a) (halve b))
        :else (+ a (mult a (- b 1)))))