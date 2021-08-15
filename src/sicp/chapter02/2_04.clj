(ns sicp.chapter02.2-04)

; Cons returns a lambda of two args which takes two innitial values
(defn my-cons [a b]
  (fn [m] (m a b)))

; z is a function that takes a 2 args function and return first argument `p`
(defn my-car [z]
  (z (fn [p q] p)))

; this is obvios that we need to return second argument `q`
(defn my-cdr [z]
  (z (fn [p q] q)))
