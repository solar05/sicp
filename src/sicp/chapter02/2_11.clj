(ns sicp.chapter02.2-11)

(defn make-interval [a b]
  [a b])

(defn upper-bound [interval]
  (max (first interval) (last interval)))

(defn lower-bound [interval]
  (min (first interval) (last interval)))

(defn mul-interval [x y]
  (letfn [(endpoint-sign [i]
            (cond
              (and (>= (upper-bound i) 0)
                   (>= (lower-bound i) 0)) 1
              (and (< (upper-bound i) 0)
                   (< (lower-bound i) 0)) -1
              :else 0))]
    (let [es-x (endpoint-sign x)
          es-y (endpoint-sign y)
          x-up (upper-bound x)
          x-lo (lower-bound x)
          y-up (upper-bound y)
          y-lo (lower-bound y)]
      (if (and (zero? es-x) (zero? es-y))
        (make-interval (min (* x-lo y-up) (* x-up y-lo))
                       (max (* x-lo y-lo) (* x-up y-up)))
        (let [a1 (if (and (neg? es-y) (neg? (- es-y es-x))) x-up x-lo)
              a2 (if (and (neg? es-x) (neg? (- es-x es-y))) y-up y-lo)
              b1 (if (and (neg? es-y) (neg? (+ es-y es-x))) x-lo x-up)
              b2 (if (and (neg? es-x) (neg? (+ es-x es-y))) y-lo y-up)]
          (make-interval (* a1 a2) (* b1 b2)))))))
