(ns sicp.chapter01.1-18)

(defn double [x]
  (+ x x))

(defn halve [x]
  (int (Math/floor (/ x 2))))

(defn even? [n]
  (= (rem n 2) 0))

(defn mul [a b]
  (letfn [(iter-mul [a b result]
         (cond (= 0 a) result
               (not (even? a)) (iter-mul (halve a) (double b) (+ b result))
               :else (iter-mul (halve a) (double b) result))
               )]
  (iter-mul a b 0)))

