(ns sicp.chapter02.2-34
  (:require [sicp.helper :as h]))

(defn horner-eval [x coeff-seq]
  (h/acc (fn [coeff higher-terms]
           (+ coeff (* x higher-terms)))
         0
         coeff-seq))
