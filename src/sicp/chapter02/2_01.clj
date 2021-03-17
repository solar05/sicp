(ns sicp.chapter02.2-01
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

(defn add-rat [x y]
  (make-rat (+ (* (numer x) (denom y))
               (* (numer y) (denom x)))
            (* (denom x) (denom y))))

(defn sub-rat [x y]
  (make-rat (- (* (numer x) (denom y))
               (* (numer y) (denom x)))
            (* (denom x) (denom y))))

(defn mul-rat [x y]
  (make-rat (* (numer x) (numer y))
            (* (denom y) (denom x))))

(defn div-rat [x y]
  (make-rat (* (numer x) (denom y))
            (* (denom x) (numer y))))

(defn equal-rat? [x y]
  (= (* (numer x) (denom y))
     (* (denom x) (numer y))))

(defn str-rat [x]
  (str (numer x) "/" (denom x)))
