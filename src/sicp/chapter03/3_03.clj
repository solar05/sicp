(ns sicp.chapter03.3-03)

(defn make-account [start password]
  (let [balance (atom start)]
    (letfn [(withdraw [amount]
              (if (< @balance amount)
                "Not enough money!"
                (swap! balance - amount)))
            (deposit [amount] (swap! balance + amount))
            (check-password [input action]
              (if (= input password)
                action
                (fn [_] "Incorrect password!")))
            (dispatch [pswd op]
              (let [action (cond
                             (= op 'withdraw) withdraw
                             (= op 'deposit) deposit
                             :else (fn [_] "Incorrect operation!"))]
                (check-password pswd action)))]
      dispatch)))
