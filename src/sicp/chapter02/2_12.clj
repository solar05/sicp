(ns sicp.chapter02.2-12)

(defn make-interval [a b]
  [a b])

(defn upper-bound [interval]
  (max (first interval) (last interval)))

(defn lower-bound [interval]
  (min (first interval) (last interval)))

(defn make-center-width [center width]
  (make-interval (- center width) (+ center width)))

(defn make-center-per [center tolerance]
  (let [width (/ (* center tolerance) 100.0)]
    (make-center-width center width)))

(defn center [interval]
  (/ (+ (upper-bound interval)
        (lower-bound interval))
     2. 0))

(defn percent [interval]
  (let [upper (upper-bound interval)
        lower (lower-bound interval)]
    (* (/ (- upper lower) (+ upper lower))
       100.0)))
