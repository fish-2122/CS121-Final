# CS121-Final
For our final project, we need to make an app from scratch. I had 2 ideas, I decided to go with my second one. You can see everything for the first idea in the idea1.md file.

# Dungeons and Dragons Character Sheet Creator
This app will let the user create and store character sheets for DnD.<br>
Intended users: Anyone who plays Dungeons and Dragons<br>
Purpose: This program is supposed to make it easy for players to create, store, and edit character sheets.<br>
Technologies/structures needed:
- Ability to save data
- Ability to load data
- Take data from user to create character sheets
- Dynamic list

# Use-case Analysis
Using the app will look something like this. The final product will be more detailed, this is just to get an idea of what to make.
```
DnD Character Sheet Creator
0) quit
1) create character
2) view stored characters

1)
editing character sheet
0) save and quit
1) name
2) race
3) class

1)
current name: blank
enter name:
jeremy

1)
editing character sheet
0) save and quit
1) name
2) race
3) class

2)
current race: blank
select race:
0) dragonborn
1) dwarf
2) elf
3) gnome
4) human
5) tiefling

4)
editing character sheet
0) save and quit
1) name
2) race
3) class

3)
current class: blank
select class:
0) cleric
1) fighter
2) paladin
3) ranger
4) wizard

1)
editing character sheet
0) save and quit
1) name
2) race
3) class

0)
DnD Character Sheet Creator
0) quit
1) create character
2) view stored characters

2)
stored characters:
0) back
1) jeremy

1)
options:
0) back
1) view
2) edit
3) delete

1)
name: jeremy
race: human
class: wizard

options:
0) back
1) view
2) edit
3) delete

0)
stored characters:
0) back
1) jeremy

0)
DnD Character Sheet Creator
0) quit
1) create character
2) view stored characters

0)
goodbye!
```

# Data Design
The way this app will manage data will be with serializable classes. Data received from the user will be stored in a serializable class called CharacterSheet. Each character sheet the user creates will store it's data in a CharacterSheet object. All of these objects will be stored in a list (like and ArrayList or maybe a LinkedList). Because CharacterSheet will be serializable, it will allow this list of objects to be saved in a .dat file. This will allow the created character sheets to be loaded later on even if the program has been stopped before.

# Algorithm
This isn't set in stone just yet
```mermaid
classDiagram
    class Main {
        - ArrayList<CharacterSheet> characters
        + static void main(String[] args)
        + Main()
        + void loadCharacters()
        + void saveCharacter()
        + void start()
    }

    class CharacterSheet{
        - String name
        - CharacterClass class
    }

    class CharacterClass {
        <<abstract>>
        - String name
        - ArrayList<Trait> traits
        - ArrayList<Trait> traitsLvl1
        - ArrayList<Trait> traitsLvl2
        + void compileTraits()
    }

    

    class Wizard {
        
    }

    class Cleric {

    }

    class Trait {
        String name
        String description
    }

    class Spell {
        <<abstract>>
        String school
        int spellLevel
    }

    class FireBolt {
        String damage
        int range
    }

    Main *-- CharacterSheet
    CharacterSheet *-- Spell
    CharacterSheet *-- Trait
    FireBolt --> Spell

```






```mermaid
classDiagram
    class Main {
        - ArrayList<CharacterSheet> characters
        + static void main(String[] args)
        + Main()
        + void loadCharacters()
        + void saveCharacter()
        + void start()
    }

    class CharacterSheet{
        - String name
        - int hitPoints
        - String class
        - Race race
        - int level

        - ArrayList<Trait> traits

        - int spellSlotsLvl1Max
        - int spellSlotsLvl1
        - ArrayList<Spell> spells

        + String getName()
        + void setName(String name)
        + String getClass()
        + void setClass(String class)

        + int getSpellSlotsLvl1Max()
        + void setSpellSlotsLvl1Max(int amount)
        + int getSpellSlotsLvl1()
        + void restoreSpellSlotsLvl1(int amount)
        + void restoreSpellSlotsLvl1() // this will just restore them to max
    }

    class CharacterTrait {
        String name
        String description
    }

    class Spell {
        <<abstract>>
        String school
        int spellLevel
    }

    class FireBolt {
        String damage
        int range
    }

    Main *-- CharacterSheet
    CharacterSheet *-- Spell
    CharacterSheet *-- Trait
    FireBolt --> Spell

```

# What does a character sheet have?
List of things a character sheet needs:
- Name
- Race
- Class
- Level
- Spells
- Ability scores/modifiers
This is a good goal of things to get first before adding more

# Milestones
- Finish UML and class diagram
- UML and idea approved
- Create Main class
- Create CharacterSheet class
- Create CharacterSheet dependencies
- Be able to save and load CharacterSheet objects
- Tie together everything into Main class