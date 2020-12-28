(ns sicp.helper)

(defn square [num] (* num num))

(defn cube [num] (* num num num))

(defn sum [term a next b]
  (if (> a b)
    0
    (+ (term a)
       (sum term (next a) next b))))

(defn gcd [a b]
  (loop [a (Math/abs a)
         b (Math/abs b)]
    (if (zero? b) a
        (recur b (mod a b)))))

(defn avg
  [seq]
  (float (/ (reduce + seq)
            (count seq))))

(defn round [d precision]
  (let [factor (Math/pow 10 precision)]
    (/ (Math/floor (* d factor))
       factor)))
