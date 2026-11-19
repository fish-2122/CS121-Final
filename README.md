# CS121-Final

# Game Flow
```mermaid
graph TD
    run(game compiles and runs) --> mainMenu(prints game name in terminal)
    mainMenu --> mainMenuOptions(print starting menu options: 0 exit game, 1 start game)
    mainMenuOptions --> |0| stopGame(exits game)
    mainMenuOptions --> |1| loadPlayer(game tries to load player)
    loadPlayer --> |fail| createPlayer(ask user for player name)
    createPlayer --> playIntro(print in terminal introduction to game and goal of the game)
    loadPlayer --> |success| loadCharacter(loads character from file)
    playIntro --> printPlayerMenu(print player menu options: 0 save and quit, 1 continue moving, 2 count gold)
    loadCharacter --> printPlayerMenu
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
### Player:
```
"    :)\n/ | \\\n/ \\"
```

### Prints:
```
    :)
  / | \
   / \
```

### Enemy:
```
"   >:(\n/ | \\\n/ \\\n"
```

### Prints:
```
   >:(
  / | \
   / \
```