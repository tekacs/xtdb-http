(ns http
  (:require [xtdb.api :as xt]))

(defn -main []
  (xt/start-node {:xtdb.http-server/server {:port 3030}}))
