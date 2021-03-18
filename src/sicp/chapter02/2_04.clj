(ns sicp.chapter02.2-04)

; Cons returns a lambda of two args which takes two innitial values
(defn cons [a b]
  (fn [m] (m a b)))

; z is a function that takes a 2 args function and return first argument `p`
(defn car [z]
  (z (fn [p q] p)))

; this is obvios that we nneed to return second argument `q`
(defn cdr [z]
  (z (fn [p q] q)))
