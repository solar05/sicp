(ns sicp.chapter03.3-06)

(defonce initial-value 0)

(defn rand-update [x] (inc x))

(def my-rand
  (let [state (atom initial-value)]
    (fn [op]
      (cond (= op :generate) (do
                               (swap! state rand-update)
                               @state)
            (= op :reset) (fn [new-state] (reset! state new-state))
            :else :unknown-op))))
