(ns sicp.chapter01.1-32)

;recursive
(defn acc [combiner default term a next-item b]
  (if (> a b)
    default
    (combiner (term a) (acc combiner default term (next-item a) next-item b))))

(defn sum [term a next-item b] (acc + 0 term a next-item b))

(defn product [term a next-item b] (acc * 1 term a next-item b))

;iterative
(defn acc-iter [combiner default term a next-item b]
  (letfn [(iter [a res] (if (> a b)
                          res
                          (iter (next-item a) (combiner res (term a)))))]
    (iter a default)))

(defn sum-iter [term a next-item b] (acc-iter + 0 term a next-item b))

(defn product-iter [term a next-item b] (acc-iter * 1 term a next-item b))
