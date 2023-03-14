(ns sicp.chapter03.3-07)

(defn make-joint
  [account original-password new-password]
  (fn [password & args]
    (if (= password new-password)
      (apply account original-password args)
      (apply account nil args))))
