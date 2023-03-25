(ns sicp.chapter03.3-14)

; W will point at the box pointing at d, whose cdr will point at the box pointing at c, so on and so 
; forth until it reaches the box pointing at a, whose cdr points at '()
; therefore, W is now the reversed order of V.

; V still points at the box pointing at a, but the cdr of a was set to be '() in the first iteration of loop
; therefore, V is now (a)

;w ---------------------------------------------------+
;                                                     |
;                                       +-------------+----+
;                                       |             |    |
;                          +------------+----+        |    |
;                          |            |    |        |    |
;             +------------+---+        |    |        |    |
;             |            |   |        |    |        |    |
;         +---v-+----+  +--v-+-+--+  +--v-+--+-+    +-v--+-+-+
;         |     |    |  |    |    |  |    |    |    |    |   |
;v ------>|  |  |'() |  |  | |    |  |  | |    |    | |  |   |
;         +--+--+----+  +--+-+----+  +--+-+----+    +-+--+---+
;            |             |            |             |
;            v             v            v             v
;            a             b            c             d
