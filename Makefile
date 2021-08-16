checks: lint check-kibit check-eastwood kondo
lint:
	clj -M:cljfmt-check
fix:
	clj -M:cljfmt-fix
check-kibit:
	clj -M:kibit
check-eastwood:
	clj -M:eastwood
kondo:
	clj-kondo --lint src --config .clj-kondo/config.edn
test:
	clj -M:test
.PHONY: test
