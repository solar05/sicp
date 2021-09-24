(ns sicp.chapter02.2-44)

(defn below [bottom-painter top-painter]
  (fn [frame]
    ; draw bottom
    ; draw top
    nil))

(defn beside [left-painter right-painter]
  (fn [frame]
    ; draw left
    ; draw right
    nil))

(defn up-split [painter n]
  (if (zero? n)
    painter
    (let [smaller (up-split painter (dec n))]
      (->> smaller
           (beside smaller)
           (below painter)))))
