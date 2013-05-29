(ns tictactoe-client.client-api
  (:gen-class)
  (:require [clj-http.client :as c]
            [clojure.tools.reader.edn :as edn]))

(def base-uri "http://localhost:3000/games/")

(defn- read-body
  [resp]
  (edn/read-string (:body resp)))

(defn get-game
  [game-id]
  (read-body (c/get (str base-uri game-id))))

(defn list-games
  []
  (read-body (c/get (str base-uri))))

(defn mark-a-position
  [game-id row col]
  (let [pos-map {:row row :column col}
        body (pr-str pos-map)
        uri (str base-uri game-id "/mark")]
    (read-body (c/post uri
                       {:content-type "application/edn"
                        :body body}))))

(defn create-game
  []
  (read-body (c/post base-uri
                     {:content-type "application/edn"
                      :body ""})))
