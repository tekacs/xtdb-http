# xtdb-http

This is just a really simple stub XTDB instance that starts an HTTP server on port 3030.

You can use this to try out the [XTDB REST API][rest-api], such as by using [tekacs/xtdb-ts][xtdb-ts].

For production use, you should update and customize the configuration in `src/http.clj`.

To get started, just run `./run.sh` with a recent Clojure distribution installed.

It might be interesting to package this as a JAR to make it easily runnable for anyone with a JVM.
It's not hard, but... eventually -- PRs to that end welcome.

[rest-api]: https://docs.xtdb.com/clients/http/
[xtdb-ts]: https://github.com/tekacs/xtdb-ts
