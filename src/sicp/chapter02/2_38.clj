(ns sicp.chapter02.2-38)

(defn fold-left [op initial coll]
  (letfn [(iter [result tail]
            (if (seq tail)
              (iter (op result (first tail))
                    (rest tail))
              result))]
    (iter initial coll)))
