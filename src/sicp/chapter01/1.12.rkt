#lang racket
(require rackunit)

(define (pascal-triangle n k)
  (if (or (= k 0) (= n k))
      1
      (+ (pascal-triangle (- n 1) (- k 1)) (pascal-triangle (- n 1) k))
      )
)

(check-eq? (pascal-triangle 5 2) 10)
(check-eq? (pascal-triangle 4 2) 6)

