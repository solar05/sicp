(ns sicp.chapter01.1-17)

(defn twice [x]
  (+ x x))

(defn halve [x]
  (/ x 2))

(defn mult [a b]
  (cond (zero? b) 0
        (even? b) (mult (twice a) (halve b))
        :else (+ a (mult a (dec b)))))
