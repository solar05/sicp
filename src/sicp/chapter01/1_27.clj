(ns sicp.chapter01.1-27
  (:require [sicp.helper :refer [square]]))

(defn expmod [base exp m]
  (cond
    (zero? exp) 1
    (even? exp) (rem (square
                      (expmod base (/ exp 2) m)) m)
    :else (rem (* base (expmod base (dec exp) m)) m)))

(defn equal-mod-expmod? [a num]
  (= (expmod a num num) a))

(defn check-prime [num]
  (loop [i 1]
    (if
     (< i num) (if (equal-mod-expmod? i num)
                 (recur (inc i))
                 false) true)))
