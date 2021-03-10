(ns sicp.chapter01.1-28
  (:require [sicp.chapter01.1-27 :refer [expmod]]))

(defn miller-rabin-test [a n]
  (cond
    (zero? a) true
    (= (expmod a (dec n) n) 1) (miller-rabin-test (dec a) n)
    :else false))

(defn miller-rabin-prime? [n]
  (miller-rabin-test (dec n) n))
