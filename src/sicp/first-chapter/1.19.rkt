#lang racket
(require rackunit)

(define (square n)
  (* n n))

(define (fib n)
  (begin (define (fib-iter a b p q count)
         (cond ((= count 0) b)
               ((even? count)
                (fib-iter a
                          b
                          (+ (square p) (square q))
                          (+ (* 2 p q) (square q))
                          (/ count 2)))
               (else (fib-iter (+ (* b q) (* a q) (* a p))
                               (+ (* b p) (* a q))
                               p
                               q
                               (- count 1)))
               )))
  (fib-iter 1 0 0 1 n))

(check-eq? (fib 5) 5)
(check-eq? (fib 10) 55)
(check-eq? (fib 15) 610)
(check-eq? (fib 20) 6765)


