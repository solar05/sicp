(ns sicp.chapter01.1-36
  (:require [sicp.helper :refer [avg]]))

(def tolerance 0.00001)

(defn average-dump
  [f]
  (fn [x] (avg [x (f x)])))

(defn fixed-point
  [f first-guess]
  (letfn [(close-enough? [v1 v2]
            (< (Math/abs (- v1 v2))
               tolerance))]
    (loop [guess first-guess
           step 1]
      (let [next (f guess)]
        (if (close-enough? guess next)
          {:value next :steps step}
          (recur next (inc step)))))))

(defn solution-with-average-dump
  [start-guess]
  (letfn [(transform [x] (/ (Math/log 1000)
                            (Math/log x)))]
    (fixed-point (average-dump transform) start-guess)))

(defn solution-without-average-dump
  [start-guess]
  (letfn [(transform [x] (/ (Math/log 1000)
                            (Math/log x)))]
    (fixed-point transform start-guess)))
