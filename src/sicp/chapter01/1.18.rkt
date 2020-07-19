#lang racket
(require rackunit)

(define (double x)
  (+ x x))

(define (halve x)
  (floor (/ x 2)))

(define (even? n)
  (= (remainder n 2) 0))

(define (mul a b)
  (begin (define (iter-mul a b result)
         (cond ((= 0 a) result)
               ((not (even? a)) (iter-mul (halve a) (double b) (+ b result)))
               (else (iter-mul (halve a) (double b) result))
               )))
  (iter-mul a b 0))

(check-eq? (mul 2 3) 6)
(check-eq? (mul 5 10) 50)
(check-eq? (mul 10 10) 100)
(check-eq? (mul 24 3) 72)
