(ns sicp.pairs (:refer-clojure :exclude [cons]))

(defn car [[x _]] x)

(defn cdr [[_ y]] y)

(defn cons [x y] (list x y))

(defn pair? [data]
  (and (list? data)
       (= (count data) 2)))

(defn inspect [pair]
  (if-not (pair? pair)
    pair
    (let [head (car pair)
          tail (cdr pair)]
      (format "(%s, %s)"
              (inspect head)
              (inspect tail)))))
