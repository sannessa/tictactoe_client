(ns tictactoe-client.core
  (:gen-class)
  (:require [tictactoe-client.client-api :as api]))

(defn print-game
  [game]
  (let [winner (:winner game)
        game-id (:id game)
        game-state (:game-state game)]
    (println (str "Winner: " winner))
    (println (str "Game id: " game-id))
    (println "Game state:")
    (doall
      (map #(println (str "  " %)) game-state)))
  game)

(defn list-games
  []
  (print-game (api/list-games)))

(defn create-game
  []
  (print-game (api/create-game)))

(defn get-game
  [id]
  (print-game (api/get-game id)))

(defn mark-a-position
  [id row col]
  (print-game (api/mark-a-position id row col)))

(defn -main
  "What will this do? Launch a repl? Nah, it will probably read and print"
  [& args]
  (println "Starting!"))
