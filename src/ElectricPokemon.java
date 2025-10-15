import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private static final String type = "electric";
    private static final List<String> attacks = Arrays.asList("1. Thunder Punch", "2. Electro Ball", "3. Thunder", "4. Volt Tackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    List<String> getAttacks() {
        return attacks;
    }

    public void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses Thunder Punch on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.3 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.3));
                break;
            case "water":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 2 + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel() * 2);
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.6 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.6));
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses " + name.getLevel() + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel());
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health remaining.");
    }

    public void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses Electro Ball on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.3 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.3));
                break;
            case "water":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 2 + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel() * 2);
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.6 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.6));
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses " + name.getLevel() + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel());
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health remaining.");
    }

    public void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses Thunder on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.3 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.3));
                break;
            case "water":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 2 + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel() * 2);
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.6 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.6));
                break;
            case "electric":
                System.out.println(enemy.getName() + " heals " + name.getLevel() + " hp.");
                enemy.setHp((int) (enemy.getHp() + name.getLevel() * 1.5));
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health remaining.");
    }

    public void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses Volt Tackle on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.3 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.3));
                break;
            case "water":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 2 + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel() * 2);
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.6 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.6));
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses " + name.getLevel() + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel());
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health remaining.");
    }
}