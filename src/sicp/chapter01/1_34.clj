;First invocation of f will attempt to apply its argument to 2.
;This second invokation will attempt to apply its argument (which is 2) to 2, which cause error.
;(f f)
;(f 2)
;(2 2)
;error
;Both substitution models (applicative-order evaluation and normal-order evaluation) will lead
;to the same expansion error.