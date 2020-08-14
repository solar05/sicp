(ns sicp.chapter01.1-04)
;;This program compute expression a + |b|

(defn a-plus-abs-b [a b]
  ((if (pos? b) + -) a b))
