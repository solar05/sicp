(ns sicp.chapter02.2-76)

;; I think Brian Harvey said it best in his 2011 Berkeley course on the topic, when he stated that "old code should not stop working when you add new code".
;; In this case:

;; Message-passing cannot equip old data types with new functionality without changing the definitions in the existing type - new types are no problem to existing code, as long as they implement all functions.
;; With explicit dispatch every function includes the existing types and only works for them. When you add a new type, you have no way of including them in existing procedures without changing them.
;; The lookup table of data directed programming allows for both types and procedures to be added quite seamlessly - even both at the same time! No old code has to be changed, even if a new function involves an old type or vice versa.
