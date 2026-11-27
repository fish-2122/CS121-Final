# Monster Slayer
This will be a simple text-based game ran in the terminal. It will be similar to the banking app we made, where a serialized class is saved for user data and everything will be done through a menu in the terminal. You will play as an adventurer who needs to get a certain amount of gold. You get this gold by fighting monsters.

# Game Flow
```mermaid
graph TD
    run(game compiles and runs) --> loadMonsterDatabase(loads monster database from file)
    loadMonsterDatabase --> mainMenu(print title and print options to 0 quit, 1 start game)
    mainMenu --> |0|quit(quit game)
    mainMenu --> |1|startGame(try to load Player from file)
    startGame --> |succeed|playerMenu(print playerMenu options 0 save and quit, 1 continue, 2 heal, 3 status, 4 shop, 5 check monsters)
    startGame --> |fail|createPlayer(prompt for user name and creates Player)
    createPlayer --> playerMenu
    playerMenu --> |0|savePlayer(saves the Player)
    savePlayer --> mainMenu
    playerMenu --> |2|checkForHealing(checks if the player has healing equipment)
    checkForHealing --> |true|heal(heals player)
    heal --> playerMenu
    checkForHealing --> |false|playerMenu
    playerMenu --> |3|status(print out health, damage, if the player can heal, and gold)
    status --> playerMenu
    playerMenu --> |5|checkMonsters(print out how many monsters are left)
    checkMonsters --> playerMenu
```

# Use Case Analysis
The game will look something like this
```
Welcome to Monster Slayer
0) quit game
1) start game

1)
enter name: 

jeremy
welcome to monster slayer, jeremy! you need to slay monsters to get coins so you can retire!
0) save and quit
1) continue
2) status

```


```mermaid
classDiagram
class Game {

}
    - Player player
    - ArrayList<Enemy> monsters
    + static void main(String[] args)
    
class Character {

}

class Player {

}

class Enemy {

}


```