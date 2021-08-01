(ns sicp.chapter02.2-19)

(defn- first-denom [elements]
  (first elements))

(defn- except-first-denom [elements]
  (rest elements))

(defn cc [amount coin-values]
  (cond
    (zero? amount) 1
    (or (neg? amount) (empty? coin-values)) 0
    :else (+ (cc amount
                 (except-first-denom coin-values))
             (cc (- amount
                    (first-denom coin-values))
                 coin-values))))
