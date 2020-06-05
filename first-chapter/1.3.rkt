#lang racket
(require rackunit)
(define (square x) (* x x))
(define (larger-square x y z) (cond
                                [(and (>= x y) (>= z y)) (+ (square x) (square z))]
                                [(and (>= x y) (>= y z)) (+ (square x) (square y))]
                                [(and (<= x y) (>= z x)) (+ (square y) (square z))]
                                [else (+ (square x) (square y))]
                                ))

(check-eq? (larger-square 3 4 2) 25)
(check-eq? (larger-square 3 3 3) 18)
(check-eq? (larger-square 6 3 2) 45)
(check-eq? (larger-square 2 4 5) 41)