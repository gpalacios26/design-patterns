package creational.prototype;

import creational.prototype.game.GameCharacter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> baseInventory = new ArrayList<>();
        baseInventory.add("Potion");
        baseInventory.add("Knife");

        GameCharacter baseCharacter = new GameCharacter("Base", "Rogue", 120, baseInventory);

        // Clonamos y modificamos
        GameCharacter clone1 = (GameCharacter) baseCharacter.clone();
        clone1.setName("Shadow Assassin");
        clone1.addItem("Poison Dagger");

        GameCharacter clone2 = (GameCharacter) baseCharacter.clone();
        clone2.setName("Scout");
        clone2.addItem("Bow");

        // Mostrar resultados
        System.out.println("=== Original ===");
        baseCharacter.display();

        System.out.println("\n=== Clone 1 ===");
        clone1.display();

        System.out.println("\n=== Clone 2 ===");
        clone2.display();
    }
}
