#lang racket
;This program compute expression a + |b|
(require rackunit)

(define (a-plus-abs-b a b)
  ((if (> b 0) + - ) a b))

(check-eq? (a-plus-abs-b 5 -10) 15)
(check-eq? (a-plus-abs-b 5 15) 20)
