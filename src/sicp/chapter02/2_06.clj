(ns sicp.chapter02.2-06)

(defn add [n m]
  (fn [f] (fn [x] ((n f) ((m f) x)))))
