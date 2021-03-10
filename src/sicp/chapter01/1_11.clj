(ns sicp.chapter01.1-11)

(defn fun-rec [n]
  (if (< n 3)
    n
    (+ (fun-rec (dec n)) (fun-rec (- n 2)) (fun-rec (- n 3)))))

(defn fun [n]
  (letfn [(fun-iter [a b c count]
            (cond (< n 3) n
                  (<= count 0) a
                  :else (fun-iter (+ a (* 2 b) (* 3 c)) a b (dec count)))
            (fun-iter 2 1 0 (- n 2)))]))
