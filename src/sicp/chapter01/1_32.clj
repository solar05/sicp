(ns sicp.chapter01.1-32)

;recursive
(defn acc [combiner default term a next b]
  (if (> a b)
    default
    (combiner (term a) (acc combiner default term (next a) next b))))

(defn sum [term a next b] (acc + 0 term a next b))

(defn product [term a next b] (acc * 1 term a next b))

;iterative
(defn acc-iter [combiner default term a next b]
  (letfn [(iter [a res] (if (> a b)
                          res
                          (iter (next a) (combiner res (term a)))))]
    (iter a default)))

(defn sum-iter [term a next b] (acc-iter + 0 term a next b))

(defn product-iter [term a next b] (acc-iter * 1 term a next b))
