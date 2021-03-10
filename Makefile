checks: lint check-kibit kondo
lint:
	lein cljfmt check
fix:
	lein cljfmt fix
check-kibit:
	lein kibit
kondo:
	clj-kondo --lint src	
test:
	lein test
.PHONY: test
