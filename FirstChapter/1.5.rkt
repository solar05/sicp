#lang racket
;Using applicative-order evaluation program never terminates
;because computer try to evaluate (p) but it infinitevl expand itself
(test 0 (p))
(test 0 (p))
;and so on and so on
;Using normal-order evaluation program runs succesfully
(test 0 (p))
(#t 0)
(0 0)