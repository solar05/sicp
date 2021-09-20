(ns sicp.chapter02.2-41)

(defn enum-threes [n]
  (let [fun (fn [f m] (mapcat f (range 1 m)))]
    (fun (fn [i] (fun (fn [j] (map #(list % j i) (range 1 j))) i))
         (inc n))))

(defn find-threes [n s]
  (filter #(= (reduce + %) s) (enum-threes n)))
