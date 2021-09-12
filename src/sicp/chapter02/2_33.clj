(ns sicp.chapter02.2-33)

(defn my-map [fun elems]
  (reduce #(concat %1 (list (fun %2))) '() elems))

(defn append [first-elems second-elems]
  (reduce #(concat %1 (list %2)) first-elems second-elems))

(defn length [elems]
  (reduce (fn [acc x] (inc acc)) 0 elems))
