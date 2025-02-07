# Rock Paper Scissors - Java Console Game

## Description
This is a simple Rock-Paper-Scissors game implemented in Java using six different design patterns.

## Design Patterns Used
### Creational Patterns:
1. **Factory Method** - `MoveFactory` creates different move objects.
2. **Singleton** - `GameManager` ensures a single instance of the game.

### Structural Patterns:
3. **Adapter** - `InputAdapter` converts user input into move objects.
4. **Facade** - `GameFacade` provides a simple interface for starting the game.

### Behavioral Patterns:
5. **Strategy** - `Move` interface with different strategies (`Rock`, `Paper`, `Scissors`).
6. **Observer** - `GameObserver` notifies players about the result.

## How to Run
1. Compile and run `Main.java` in a Java environment.
2. Enter moves as "Rock", "Paper", or "Scissors" when prompted.
3. The game will determine the winner and display the result.

## Contributors
* [Tom Koster/TkosterHZ] - Responsible for implementing game creation and maintenance.
* [Pieter Jan Treur/pieterjantreur] - Responsible for implementing the code of moves and players.

## Repository
* https://github.com/TKosterHZ/RockPaperScissors

## License
MIT License
