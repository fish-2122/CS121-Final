# Monster Slayer
This will be a simple text-based game ran in the terminal. It will be similar to the banking app we made, where a serialized class is saved for user data and everything will be done through a menu in the terminal. You will play as an adventurer who needs to get a certain amount of gold. You get this gold by fighting monsters.

# Game Flow
```mermaid
graph TD
    
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