(ns sicp.chapter03.3-04)

(defn make-account [start password]
  (let [balance (atom start)
        attempts-count (atom 0)]
    (letfn [(withdraw [amount]
              (if (< @balance amount)
                "Not enough money!"
                (swap! balance - amount)))
            (deposit [amount] (swap! balance + amount))
            (call-the-cops [_] "FBI, open up!")
            (check-password [input action]
              (if (= input password)
                action
                (if (< @attempts-count 7)
                  (do 
                    (swap! attempts-count inc)
                    (fn [_] "Incorrect password!"))
                  call-the-cops)))
            (dispatch [pswd op]
              (let [action (cond
                             (= op 'withdraw) withdraw
                             (= op 'deposit) deposit
                             :else (fn [_] "Incorrect operation!"))]
                (check-password pswd action)))]
      dispatch)))
