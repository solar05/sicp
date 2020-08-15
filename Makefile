checks: lint check-kibit
lint:
		lein cljfmt check
fix:
		lein cljfmt fix
check-kibit:
		lein kibit
tests:
		lein test
