(ns sicp.chapter02.2-07)

(defn make-interval [a b]
  [a b])

(defn upper-bound [interval]
  (max (first interval) (last interval)))

(defn lower-bound [interval]
  (min (first interval) (last interval)))
