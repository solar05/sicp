(ns sicp.chapter02.2-70-test
  (:require [clojure.string :as s]
            [clojure.test :refer [deftest]]
            [sicp.chapter02.2-67 :as ch7]
            [sicp.chapter02.2-68 :as ch8]
            [sicp.chapter02.2-70 :as ch]
            [sicp.test-helper :refer [assert-equal]]))

(defonce song-message
  (map
   (comp symbol s/upper-case)
   '(Get
     a
     job
     Sha
     na
     na
     na
     na
     na
     na
     na
     na
     Get
     a
     job
     Sha
     na
     na
     na
     na
     na
     na
     na
     na
     Wah
     yip
     yip
     yip
     yip
     yip
     yip
     yip
     yip
     yip
     Sha
     boom)))

(deftest test-rock-songs-alphabet
  (let [tree ch/rock-songs-alphabet
        encoded-message (ch8/encode tree song-message)]
    (assert-equal '(1 1 1 1 1 1 1 1 1 0 1 1 0 0 1 1 1 0 0 0 0 0
                      0 0 0 0 1 1 1 1 1 1 1 1 1 0 1 1 0 0 1 1 1
                      0 0 0 0 0 0 0 0 0 1 1 0 1 1 1 0 1 0 1 0 1
                      0 1 0 1 0 1 0 1 0 1 0 1 1 1 0 1 1 0 1 0)
                  encoded-message)
    (assert-equal song-message (ch7/decode encoded-message tree))
    (assert-equal 84 (count encoded-message))
    (assert-equal 108 (* 3 (count song-message)))))
