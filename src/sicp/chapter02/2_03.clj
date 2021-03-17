(ns sicp.chapter02.2-03
  (:require [sicp.points :refer [distance make-point x-point y-point]]))

(defn make-rect [bottom-left top-right]
  [bottom-left top-right])

(defn- bottom-left [rect]
  (first rect))

(defn- top-right [rect]
  (last rect))

(defn- top-left [rect]
  (let [x (x-point (bottom-left rect))
        y (y-point (top-right rect))]
    (make-point x y)))

(defn- bottom-right [rect]
  (let [x (x-point (top-right rect))
        y (y-point (bottom-left rect))]
    (make-point x y)))

(defn width [rect]
  (distance (bottom-left rect) (top-left rect)))

(defn length [rect]
  (distance (bottom-left rect) (bottom-right rect)))

(defn perimeter [rect]
  (* (+ (width rect) (length rect)) 2))

(defn area [rect]
  (* (width rect) (length rect)))
