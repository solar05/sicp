(ns sicp.chapter02.2-10)

(defn make-interval [a b]
  [a b])

(defn upper-bound [interval]
  (max (first interval) (last interval)))

(defn lower-bound [interval]
  (min (first interval) (last interval)))

(defn sub-interval [x y]
  (make-interval (- (lower-bound x) (upper-bound y))
                 (- (upper-bound x) (lower-bound y))))

(defn mul-interval [x y]
  (let [p1 (* (lower-bound x) (lower-bound y))
        p2 (* (lower-bound x) (upper-bound y))
        p3 (* (upper-bound x) (lower-bound y))
        p4 (* (upper-bound x) (upper-bound y))]
    (make-interval (min p1 p2 p3 p4) (max p1 p2 p3 p4))))

(defn div-interval [x y]
  (if (neg? (* (lower-bound y) (upper-bound y)))
    "Division error"
    (mul-interval x (make-interval
                     (/ 1.0 (upper-bound y))
                     (/ 1.0 (lower-bound y))))))

