;Lisa variant of expmod wasn`t effective for prime numbers checking since the
;operations performed by this procedure will occur on numbers of order base ^ exp, while the expmod procedure
;from 1.24 exercise operates with numbers of order exp, which has a significant effect on the computation speed
;for large base and exp.
