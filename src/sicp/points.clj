(ns sicp.points)

(defn make-segment [first-point second-point]
  [first-point second-point])

(defn start-segment [segment]
  (first segment))

(defn end-segment [segment]
  (last segment))

(defn make-point [x y]
  [x y])

(defn x-point [point]
  (first point))

(defn y-point [point]
  (last point))

(defn distance [first-point second-point]
  (let [x1 (x-point first-point)
        x2 (x-point second-point)
        y1 (y-point first-point)
        y2 (y-point second-point)]
    (Math/hypot (- x2 x1) (- y2 y1))))
