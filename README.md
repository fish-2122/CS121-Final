# CS121-Final
For our final project, we need to make an app from scratch. I had 2 ideas, I decided to go with my second one. You can see everything for the first idea in the idea1.md file.

# Dungeons and Dragons Character Sheet Creator
This app will let the user create and store character sheets for DnD. It will use an API (https://www.dnd5eapi.co/api) to get classes, races, spells etc.<br>
Intended users: Anyone who plays Dungeons and Dragons<br>
Purpose: This program is supposed to make it easy for players to create, store, and edit character sheets.<br>
Technologies/structures needed:
- Ability to save data
- Ability to load data
- Access data from an API
- Take data from user to create character sheets
- Dynamic list

# Use-case Analysis Prototype
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

# Character Sheet Requirements
List of things a character sheet needs:
- Name
- Race
- Class


# Flowchart
```mermaid
graph TD
    start(program runs) --> loadCharacters(all saved characters are loaded)
```