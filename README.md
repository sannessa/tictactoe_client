# tictactoe_client

Manual client for playing Jason Gilman's tictactoe client
https://github.com/jasongilman/tictactoe_server

## Installation

git clone

## Usage

- Play the game by calling the functions in a REPL
    (create-game)
    (get-game id)
    (mark-a-position id row col)
    (list-games)

## Examples

tictactoe-client.core=> (create-game)

Winner: 

Game id: 7

Game state:
  [:b :b :b]
  [:b :b :b]
  [:b :b :b]
{:id 7, :game-state [[:b :b :b] [:b :b :b] [:b :b :b]]}
tictactoe-client.core=> (get-game 7)
Winner: 
Game id: 7
Game state:
  [:b :b :b]
  [:b :b :b]
  [:b :b :b]
{:id 7, :game-state [[:b :b :b] [:b :b :b] [:b :b :b]]}
tictactoe-client.core=> (mark-a-position 7 0 0)
Winner: 
Game id: 7
Game state:
  [:x :o :b]
  [:b :b :b]
  [:b :b :b]
{:winner nil, :id 7, :game-state [[:x :o :b] [:b :b :b] [:b :b :b]]}
tictactoe-client.core=> (mark-a-position 7 1 1)
Winner: 
Game id: 7
Game state:
  [:x :o :o]
  [:b :x :b]
  [:b :b :b]
{:winner nil, :id 7, :game-state [[:x :o :o] [:b :x :b] [:b :b :b]]}
tictactoe-client.core=> (mark-a-position 7 2 2)
Winner: :x
Game id: 7
Game state:
  [:x :o :o]
  [:b :x :b]
  [:b :b :x]
{:winner :x, :id 7, :game-state [[:x :o :o] [:b :x :b] [:b :b :x]]}
tictactoe-client.core=> 


### Bugs

Everywhere!


Distributed under the Eclipse Public License, the same as Clojure.
