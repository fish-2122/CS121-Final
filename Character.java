import java.util.*;

abstract class Character  {
    String name;
    int health
    int damage;

    void dealDamage(int damage, Character target) {
        target.takeDamage(damage);
    }

    void takeDamage(int amount) {
        health -= amount;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getHealth() {
        return health;
    }

    void setHealth(int health) {
        this.health = health;
    }

    int getDamage() {
        return damage;
    }

    void setDamage(int damage) {
        this.damage = damage;
    }
}