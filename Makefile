checks: lint check-kibit check-eastwood kondo
lint:
	clojure -A:cljfmt-check
fix:
	clojure -A:cljfmt-fix
check-kibit:
	clojure -A:kibit
check-eastwood:
	clojure -A:eastwood
kondo:
	clj-kondo --lint src --config .clj-kondo/config.edn
test:
	clojure -A:test
.PHONY: test
