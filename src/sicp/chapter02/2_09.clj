(ns sicp.chapter02.2-09)

;For additionn and substraction the width result is a function of the widths of the input
;[aLower, aUpper] + [bLower, bUpper] = [aLower + bLower, aUpper + bUpper]
;The width of this interval is
;width = 1/2 * ((aUpper + bUpper) - (aLower + bLower))
; = 1/2 * ((aUpper - aLower) + (bUpper - bLower)) = width of first interval (a) + width of second innterval (b)
;For multiplication and division result a different. If the width of the result was a function of the width of inputs, then multiplying different intervals with the same width should give the same answer
;Lets multiply a width 5 interval with a width 1 interval
;[0, 10] * [0, 2] = [0, 20] (width = 10)
;The followinng intervals have the same width, but multiplying gives different result
;[-5, 5] * [-1, 1] = [-5, 5] (width = 5)
