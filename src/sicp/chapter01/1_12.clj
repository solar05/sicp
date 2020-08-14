(ns sicp.chapter01.1-12)

(defn pascal-triangle [n k]
  (if (or (zero? k) (= n k))
    1
    (+ (pascal-triangle (dec n) (dec k)) (pascal-triangle (dec n) k))))
