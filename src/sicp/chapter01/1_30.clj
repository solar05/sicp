(ns sicp.chapter01.1-30)

(defn iter-sum [term a next b]
  (letfn [(iter [a result]
            (if (> a b)
              result
              (iter (next a) (+ result (term a)))))]
    (iter a 0)))

(defn simpson-integral [f a b n]
  (let [h (/ (- b a) n)]
    (letfn [(add-2h [x] (+ x (* 2 h)))]
      (* (/ h 3.0) (+ (f a)
                      (* 4.0 (iter-sum f (+ a h) add-2h b))
                      (* 2.0 (iter-sum f (add-2h a) add-2h (- b h)))
                      (f b))))))
