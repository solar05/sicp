checks: lint check-kibit check-eastwood kondo
lint:
	lein cljfmt check
fix:
	lein cljfmt fix
check-kibit:
	lein kibit
check-eastwood:
	lein eastwood "{:exclude-linters [:reflection :no-ns-form-found]}"
kondo:
	clj-kondo --lint src --config .clj-kondo/config.edn
test:
	bin/kaocha
.PHONY: test
