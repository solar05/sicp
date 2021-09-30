(ns sicp.chapter02.2-51-test
  (:require [clojure.test :refer [deftest]]
            [sicp.chapter02.2-47 :refer [make-frame]]
            [sicp.chapter02.2-51 :as ch]
            [sicp.test-helper :refer [assert-equal]]))

(defn draw [picture]
  (fn [frame]
    (swap! picture conj frame)))

(deftest test-below
  (let [picture (atom [] :validator vector?)
        painter (ch/below (draw picture) (draw picture))]
    (assert-equal ['([0.0 0.0] [1.0 0.0] [0.0 0.5])
                   '([0.0 0.5] [1.0 0.0] [0.0 0.5])]
                  (do (painter (make-frame [0.0 0.0] [1.0 0.0] [0.0 1.0])) @picture)))

  (let [picture (atom [] :validator vector?)
        painter (ch/below (draw picture) (draw picture))]
    (assert-equal ['([5.0 5.0] [2.0 1.0] [0.5 1.0])
                   '([5.5 6.0] [2.0 1.0] [0.5 1.0])]
                  (do (painter (make-frame [5.0 5.0] [2.0 1.0] [1.0 2.0])) @picture))))

(deftest test-beside
  (let [picture (atom [] :validator vector?)
        painter (ch/beside (draw picture) (draw picture))]
    (assert-equal ['([0.0 0.0] [0.5 0.0] [0.0 1.0])
                   '([0.5 0.0] [0.5 0.0] [0.0 1.0])]
                  (do (painter (make-frame [0.0 0.0] [1.0 0.0] [0.0 1.0])) @picture)))

  (let [picture (atom [] :validator vector?)
        painter (ch/below (draw picture) (draw picture))]
    (assert-equal ['([5.0 5.0] [2.0 1.0] [0.5 1.0])
                   '([5.5 6.0] [2.0 1.0] [0.5 1.0])]
                  (do (painter (make-frame [5.0 5.0] [2.0 1.0] [1.0 2.0])) @picture))))
