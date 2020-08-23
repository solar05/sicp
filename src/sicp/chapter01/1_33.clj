(ns sicp.chapter01.1-33
  (:require [sicp.chapter01.1-21 :refer [prime?]]
            [sicp.helper :refer [square gcd]]))

(defn filtered-acc [combiner null-value term a next-term b filter-term]
  (loop [a a
         acc null-value]
    (if (> a b)
      acc
      (recur (next-term a)
             (if (filter-term a)
               (combiner acc (term a))
               acc)))))

(defn sum-of-prime-squares [a b]
  (filtered-acc + 0 square a inc b prime?))

(defn relative-prime? [m n]
  (= (gcd m n) 1))

(defn product-of-relative-primes [n]
  (letfn [(filtrator [x] (relative-prime? x n))]
    (filtered-acc * 1 identity 1 inc n filtrator)))
