(ns sicp.chapter01.1-45
  (:require [sicp.chapter01.1-16 :refer [fast-expt]]
            [sicp.chapter01.1-35 :refer [fixed-point]]
            [sicp.chapter01.1-36 :refer [average-dump]]
            [sicp.chapter01.1-43 :refer [repeated]]))

(defn nth-root [x n]
  (let [dump-count (-> n inc Math/log (/ (Math/log 2)) dec Math/ceil)
        nth-dump (repeated average-dump dump-count)
        transform #(->> n dec (fast-expt %) (/ x))]
    (fixed-point (nth-dump transform) 1.0)))
