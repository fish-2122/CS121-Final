# CS121-Final
This will be a simple text-based game ran in the terminal. It will be similar to the banking app we made, where a serialized class is saved for user data and everything will be done through a menu in the terminal. You will play as an adventurer who needs to get a certain amount of gold. You get this gold by fighting monsters.

# Game Flow
```mermaid
graph TD
    run(game compiles and runs) --> mainMenu(prints game name in terminal)
    mainMenu --> mainMenuOptions(print starting menu options: 0 exit game, 1 start game)
    mainMenuOptions --> |0| stopGame(program stops)
    mainMenuOptions --> |1| loadPlayer(game tries to load player)
    loadPlayer --> |fail| createPlayer(ask user for player name to create new Player)
    createPlayer --> playIntro(print in terminal introduction to game and goal of the game)
    loadPlayer --> |success| loadCharacter(loads character from file)
    playIntro --> playerMenuOptions(print player menu options: 0 save and quit, 1 continue moving, 2 count gold)
    loadCharacter --> playerMenuOptions
    playerMenuOptions --> |0| saveGame(the Player object is saved)
    saveGame --> mainMenu
    playerMenuOptions --> |2| showGold(gets gold integer and prints it in console)
    showGold --> checkForGoldThreshold(if player has enough gold, complete game)
    checkForGoldThreshold --> |fail| playerMenuOption
    checkForGoldThreshold --> |success| meetGoldThreshold(congradulate the player and ask if they want to 0 end the game, 1 keep going)
    meetGoldThreshold --> |0| saveGame
    meetGoldThreshold --> |1| playerMenuOptions
```

# Class Diagram
```mermaid
classDiagram
class Game {
    - Player player
    + static void main(String[] args)
    + void loadPlayer()
    + void savePlayer()
    + void start()
    + String menu()
}
class Character {
    <<abstract>>
    - String name
    - int health
    - int damage
    + void dealDamage(int amount, Character target)
    + void takeDamage(int amount)
    + String getName()
    + void setName(String name)
    + int getHealth()
    + void setHealth(int health)
    + int getDamage()
    + void setDamage(int damage)
}
class Enemy {
    - String sprite
    + String returnSprite()
}
class Player {
    <<Serializable>>
    - int gold
    - String sprite
    + Player()
    + Player(String name, int health, int damage, int gold)
    + int getGold()
    +void setGold(int gold)
    + String returnSprite()
}
class HasSprite {
    // the sprites will be simple ASCII art, not actual images
    <<Interface>>
    String sprite
    String returnSprite()
}

Player <|-- Character
Enemy <|-- Character
Character --|> HasSprite
Game *-- Player
```

# Sprites (subject to change)
## Player
### String:
```
"    :)\n/ | \\\n/ \\"
```

### Prints:
```
    :)
  / | \
   / \
```

## Enemy
### String:
```
"   >:(\n/ | \\\n/ \\\n"
```

### Prints:
```
   >:(
  / | \
   / \
```