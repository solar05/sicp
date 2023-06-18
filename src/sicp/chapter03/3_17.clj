(ns sicp.chapter03.3-17
  (:require [sicp.pairs :as p]))

(defn count-pairs [x]
  (let [visited (atom (list))]
    (letfn [(check-visited [x]
              (if (p/in? x @visited)
                0
                (do (swap! visited conj x) 1)))
            (inner-count [x]
              (if-not (p/pair? x)
                0
                (+
                 (inner-count (p/car x))
                 (inner-count (p/cdr x))
                 (check-visited x))))]
      (inner-count x))))
