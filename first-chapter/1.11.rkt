#lang racket

(define (fun-rec n)
  (if (< n 3)
      n
      (+ (fun-rec (- n 1)) (fun-rec (- n 2)) (fun-rec (- n 3)))
  )
)

(define (fun n)
  (define (fun-iter a b c count)
    (cond ((< n 3) n)
          ((<= count 0) a)
          (else (fun-iter (+ a (* 2 b) (* 3 c)) a b (- count 1)))))
  (fun-iter 2 1 0 (- n 2)))
  