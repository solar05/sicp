(ns sicp.chapter03.3-16) 

;(def str1 '(foo bar baz)) 
;(count-pairs str1) ; 3 
; str1 -> ( . ) -> ( . ) -> ( . ) ->null 
;          |        |        | 
;          v        v        v 
;         'foo     'bar     'baz 

;(def x '(foo)) 
;(def y (cons x x)) 
;(def str2 (list y)) 
;(count-pairs str2) ; 4 
; str2 -> ( . ) -> null 
;          | 
;          v 
;         ( . ) 
;          | | 
;          v v 
;         ( . ) -> 'null 
;          | 
;          v 
;         'foo 

;(def x '(foo)) 
;(def y (cons x x)) 
;(def str3 (cons y y)) 
;(count-pairs str3) ; 7 
; str3 -> ( . ) 
;          | | 
;          v v 
;         ( . ) 
;          | | 
;          v v 
;         ( . ) -> null 
;          | 
;          v 
;         'foo 

;(def str4 '(foo bar baz)) 
;(set-cdr! (cddr str4) str4) 
;(count-pairs str4) ; maximum recursion depth exceeded 
;          ,-------------------, 
;          |                   | 
;          v                   | 
; str4 -> ( . ) -> ( . ) -> ( . ) 
;          |        |        | 
;          v        v        v 
;         'foo     'bar     'baz
