#lang racket

(define (improve guess x)
  (/ (+ (/ x (square guess)) (* 2 guess)) 3)
)

(define (square x) (* x x))

(define (good-enough? guess x)
  (< (abs (- (improve guess x) guess))
     (* guess 0.001)))

(define (cbrt x) (cbrt-iter 0.1 x))

(define (cbrt-iter guess x)
  (if (good-enough? guess x) guess (cbrt-iter (improve guess x) x))
 )