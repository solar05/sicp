;Clojure uses applicative-order evaluation, and if statement is special-form
;which uses applicative-order evaluatin, when new-if is common procedure, which
;uses normal normal-order evaluation, because of that programm run out of memory
;till executing.
