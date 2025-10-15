import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private static final String type = "fire";
    private static final List<String> attacks = Arrays.asList("1. Fire Lash", "2. Flame Thrower", "3. Pyro Ball", "4. Inferno");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }


    List<String> getAttacks() {
        return attacks;
    }

    public void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses Inferno on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire":
                System.out.println(enemy.getName() + " loses " + name.getLevel() + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel());
                break;
            case "water":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.6 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.6));
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 2 + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel() * 2);
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.3 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.3));
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health remaining.");
    }

    public void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses Pyro Ball on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire":
                System.out.println(enemy.getName() + " loses " + name.getLevel() + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel());
                break;
            case "water":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.6 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.6));
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 2 + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel() * 2);
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.3 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.3));
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health remaining.");
    }

    public void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses Fire Lash on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire":
                System.out.println(enemy.getName() + " loses " + name.getLevel() + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel());
                break;
            case "water":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.6 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.6));
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 2 + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel() * 2);
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.3 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.3));
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health remaining.");
    }

    public void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses FlameThrower on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire":
                System.out.println(enemy.getName() + " loses " + name.getLevel() + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel());
                break;
            case "water":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.6 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.6));
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 2 + " hp.");
                enemy.setHp(enemy.getHp() - name.getLevel() * 2);
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses " + name.getLevel() * 1.3 + " hp.");
                enemy.setHp((int) (enemy.getHp() - name.getLevel() * 1.3));
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health remaining.");
    }

}