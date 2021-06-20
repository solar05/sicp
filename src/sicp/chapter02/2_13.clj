(ns sicp.chapter02.2-13)

(defn make-interval [a b]
  [a b])

(defn upper-bound [interval]
  (max (first interval) (last interval)))

(defn lower-bound [interval]
  (min (first interval) (last interval)))

(defn center [interval]
  (/ (+ (upper-bound interval) (lower-bound interval)) 2.0))

(defn make-interval-center-per [center percent]
  (let [width (* center (/ percent 100.0))]
    (make-interval (- center width) (+ center width))))

(defn percent-tolerance [interval]
  (let [center (/ (+ (upper-bound interval) (lower-bound interval)) 2.0)
        width (/ (- (upper-bound interval) (lower-bound interval)) 2.0)]
    (* (/ width center) 100.0)))

(defn mul-interval [x y]
  (let [i1 (* (lower-bound x) (lower-bound y))
        i2 (* (lower-bound x) (upper-bound y))
        i3 (* (upper-bound x) (lower-bound y))
        i4 (* (upper-bound x) (upper-bound y))]
    (make-interval (min i1 i2 i3 i4)
                   (max i1 i2 i3 i4))))
