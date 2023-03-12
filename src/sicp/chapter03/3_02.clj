(ns sicp.chapter03.3-02)

(defn make-monitored [fun]
  (let [calls-counter (atom 0)]
    (letfn [(dispatch [op]
              (cond
                (= op 'how-many-calls?) @calls-counter
                (= op 'reset-count) (reset! calls-counter 0)
                :else (do (swap! calls-counter inc) (fun op))))]
      dispatch)))
