(ns sicp.chapter02.2-02)

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

(defn midpoint-segment [segment]
  (let [x-middle (/ (+ (x-point (start-segment segment))
                       (x-point (end-segment segment))) 2.0)
        y-middle (/ (+ (y-point (start-segment segment))
                       (y-point (end-segment segment))) 2.0)]
    (make-point x-middle y-middle)))

(defn print-point [point]
  (str "(" (x-point point) ", " (y-point point) ")"))
