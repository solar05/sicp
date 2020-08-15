(ns sicp.chapter01.1-22
  (:require [sicp.helper :as h]))

(defn square [n]
  (* n n))

(defn divides? [a b]
  (zero? (rem b a)))

(defn find-divisor [n test-divisor]
  (cond
    (> (square test-divisor) n) n
    (divides? test-divisor n) test-divisor
    :else (find-divisor n (inc test-divisor))))

(defn smallest-divisor [n]
  (find-divisor n 2))

(defn prime? [n]
  (= n (smallest-divisor n)))

(defn report-time [expr]
  (time expr))

(defn s-f-p [n counter]
  (if (> counter 0)
    (s-f-p (+ n 2) (dec counter))
    (s-f-p (+ n 2) counter)))

(defn search-for-primes [n counter]
  (if (even? n)
    (s-f-p (inc n) (dec counter)
    (s-f-p (+ n 2) counter))))
