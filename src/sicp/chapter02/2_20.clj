(ns sicp.chapter02.2-20)

(defn same-parity [& numbers]
  (let [parity (if (even? (first numbers))
                 even?
                 odd?)]
    (filterv parity numbers)))
