(ns sicp.chapter01.1-29
  (:require [sicp.helper :refer [sum]]))

(defn simpson-integral [f a b n]
  (let [h (/ (- b a) n)]
    (letfn [(add-2h [x] (+ x (* 2 h)))]
      (* (/ h 3.0) (+ (f a)
                      (* 4.0 (sum f (+ a h) add-2h b))
                      (* 2.0 (sum f (add-2h a) add-2h (- b h)))
                      (f b))))))
