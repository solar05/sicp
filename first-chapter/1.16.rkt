#lang racket
(require rackunit)

(define (square x)
  (* x x))

(define (even? n)
  (= (remainder n 2) 0))

(define (fast-expt b n)
  (begin (define (iter-expt b n a)
     (cond ((= n 0) a)
           ((even? n) (iter-expt (square b) (/ n 2) a))
           (else (iter-expt b (- n 1) (* a b)))))
   (iter-expt b n 1)))

(check-eq? (fast-expt 2 2) 4)
(check-eq? (fast-expt 2 3) 8)
(check-eq? (fast-expt 2 4) 16)
(check-eq? (fast-expt 2 5) 32)
(check-eq? (fast-expt 2 6) 64)
(check-eq? (fast-expt 2 7) 128)
(check-eq? (fast-expt 2 8) 256)
(check-eq? (fast-expt 2 9) 512)
(check-eq? (fast-expt 2 10) 1024)
(check-eq? (fast-expt 2 20) 1048576)
(check-eq? (fast-expt 3 3) 27)
(check-eq? (fast-expt 4 4) 256)
(check-eq? (fast-expt 5 5) 3125)
(check-eq? (fast-expt 6 6) 46656)
(check-eq? (fast-expt 7 7) 823543)
(check-eq? (fast-expt 8 8) 16777216)
(check-eq? (fast-expt 9 9) 387420489)

