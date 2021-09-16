(ns sicp.chapter02.2-36)

(defn accumulate-n [op init seqs]
  (when (seq (first seqs))
    (cons (reduce op init (map first seqs))
          (accumulate-n op init (map rest seqs)))))
