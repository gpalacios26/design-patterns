package creational.prototype.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Patrón Prototype
 * Propósito: El patrón Prototype permite crear nuevos objetos copiando un objeto existente.
 */
public class GameCharacter implements CharacterPrototype {

    private String name;
    private String type;
    private int health;
    private List<String> inventory;

    public GameCharacter(String name, String type, int health, List<String> inventory) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.inventory = new ArrayList<>(inventory);
    }

    @Override
    public CharacterPrototype clone() {
        return new GameCharacter(name, type, health, new ArrayList<>(inventory));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addItem(String item) {
        inventory.add(item);
    }

    public void display() {
        System.out.println(name + " | Type: " + type + " | HP: " + health);
        System.out.println("Inventory: " + inventory);
    }
}
