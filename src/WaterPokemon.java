import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private static final String type = "water";
    private static final List<String> attacks = Arrays.asList("1. Surf", "2. Hydro Pump", "3. Hydro Canon", "4. Rain Dance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    List<String> getAttacks() {
        return attacks;
    }

    public void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses Surf on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 2 + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel() * 2);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses " + name.getLevel() + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel());
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.3 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.3));
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.6 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.6));
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health remaining.");
    }

    public void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses Hydro Pump on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 2 + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel() * 2);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses " + name.getLevel() + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel());
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.3 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.3));
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.6 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.6));
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health remaining.");
    }

    public void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses Hydro Canon on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 2 + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel() * 2);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses " + name.getLevel() + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel());
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.3 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.3));
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.6 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.6));
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health remaining.");
    }

    public void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses Rain Dance on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 2 + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel() * 2);
                break;
            case "water":
                System.out.println(enemy.getName() + " heals for " + name.getLevel() * 1.5 + " hp.");
                enemy.setHp((int) (enemy.getHp() + name.getLevel() * 1.5));
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.3 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.3));
                break;
            case "electric":
                System.out.println("This has no effect on the enemy.");
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health remaining.");
    }
}
