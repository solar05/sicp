(ns sicp.chapter03.3-13)

; procedure make-circle will make a circular list 
; the cdr of last cell of the list, instead of pointing to nil points to the first cell of the list
; if we try to compute (last-pair z) will produce infinite recursion 
