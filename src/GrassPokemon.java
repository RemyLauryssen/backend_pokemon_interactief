import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private static final String type = "grass";
    private static final List<String> attacks = Arrays.asList("1. Leaf Storm", "2. Solar Beam", "3. Leech Seed", "4. Leaf Blade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    List<String> getAttacks() {
        return attacks;
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses Leaf Storm on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.6 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.6));
                break;
            case "water":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.3 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.3));
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses " + name.getLevel() + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel());
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 2 + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel() * 2);
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health remaining.");
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses Solar Beam on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.6 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.6));
                break;
            case "water":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.3 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.3));
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses " + name.getLevel() + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel());
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 2 + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel() * 2);
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health remaining.");
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses Leech Seed on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.6 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.6));
                name.setHp((int) (enemy.getHp() + name.getLevel() * 1.6));
                break;
            case "water":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.3 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.3));
                name.setHp((int) (enemy.getHp() + name.getLevel() * 1.3));
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses " + name.getLevel() + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel());
                name.setHp(enemy.getHp() + name.getLevel());
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 2 + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel() * 2);
                name.setHp(enemy.getHp() + name.getLevel() * 2);
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health remaining.");
    }

    public void leafBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses Leaf Blade on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.6 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.6));
                break;
            case "water":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.3 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.3));
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses " + name.getLevel() + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel());
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 2 + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel() * 2);
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health remaining.");
    }
}