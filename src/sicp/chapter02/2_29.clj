(ns sicp.chapter02.2-29)

(defn make-mobile [left right]
  (list left right))

(defn make-branch [length structure]
  (list length structure))

(defn left-branch [mobile]
  (first mobile))

(defn right-branch [mobile]
  (last mobile))

(defn branch-length [branch]
  (first branch))

(defn branch-structure [branch]
  (last branch))

(defn mobile? [m] (list? m))

(defn total-weight [mobile]
  (let [left (left-branch mobile)
        right (right-branch mobile)
        branch-weight #(let [structure (branch-structure %)]
                         (if (mobile? structure)
                           (total-weight structure)
                           structure))]
    (+ (branch-weight left)
       (branch-weight right))))

(defn balanced? [mobile]
  (letfn [(balanced-branch? [branch]
            (let [structure (branch-structure branch)]
              (if (number? structure) true (balanced? structure))))
          (branch-weight [branch]
            (let [structure (branch-structure branch)]
              (if (number? structure) structure (total-weight structure))))]
    (let [left-br (left-branch mobile)
          right-br (right-branch mobile)]
      (and
       (balanced-branch? left-br)
       (balanced-branch? right-br)
       (= (* (branch-length left-br)
             (branch-weight left-br))
          (* (branch-length right-br)
             (branch-weight right-br)))))))


