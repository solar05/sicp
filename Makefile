checks: lint check-kibit check-eastwood check-kondo

lint:
	clojure -M:cljfmt-check

fix:
	clojure -M:cljfmt-fix

check-kibit:
	clojure -M:kibit

check-eastwood:
	clojure -M:eastwood

check-kondo:
	clj-kondo --lint src --config .clj-kondo/config.edn

test:
	clojure -M:test

check-outdated:
	clojure -Sdeps '{:deps {com.github.liquidz/antq {:mvn/version "RELEASE"}}}' -M -m antq.core

.PHONY: test
