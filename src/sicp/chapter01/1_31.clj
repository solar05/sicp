(ns sicp.chapter01.1-31)

;a task
(defn product [term a next-item b]
  (if (> a b)
    1
    (* (term a) (product term (next-item a) next-item b))))

(defn factorial [n]
  (product identity 1 inc n))

;b task
(defn product-iter [term a next-item b]
  (letfn [(iter [a res]
            (if (> a b)
              res
              (iter (next-item a) (* (term a) res))))]
    (iter a 1)))

(defn factorial-iter [n]
  (product-iter identity 1 inc n))
