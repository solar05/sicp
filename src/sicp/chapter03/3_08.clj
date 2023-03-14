(ns sicp.chapter03.3-08)

(defn make-f []
  (let [current (atom 0)]
    (fn [num]
      (let [existing @current]
        (reset! current num)
        existing))))
