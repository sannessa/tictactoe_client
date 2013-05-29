(defproject tictactoe_client "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.reader "0.7.4"]
                 [clj-http "0.7.2"]]
  :user {:injections [(require '(clojure.tools.namespace repl find))]}
  :main tictactoe-client.core)
