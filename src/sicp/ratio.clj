(ns sicp.ratio
  (:require [sicp.helper :as h]))

(defn make-rat
  ([n]
   (make-rat n 1))
  ([n d]
   (let [g (h/gcd n d)
         n (/ n g)
         d (/ d g)]
     [(if (neg? d)
        (* -1 n)
        n)
      (Math/abs d)])))

(defn numer [x] (first x))

(defn denom [x] (last x))
