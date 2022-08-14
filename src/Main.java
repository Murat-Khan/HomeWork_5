import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefence("");
        System.out.println("BOSS = " + "Health: " + boss.getHealth() +" Damage: " + boss.getDamage() +
                " Defence: " + boss.getDefence());

        for (int i = 0; i < createHeroes().length; i++){
            System.out.println("hero " + (i + 1) + " = " + "Health: " + createHeroes()[i].getHealth() + " Damage: " + createHeroes()[i].getDamage() + " Superpower: "
            + createHeroes()[i].getSuperpower());
        }
    }

    public static Hero[] createHeroes() {
        Hero physical = new Hero(300, 25);
        Hero magical = new Hero(250, 30, "magic");
        Hero kinetic = new Hero(350, 15, "kinetic");



        Hero[] heroes = {physical, magical, kinetic};

        return heroes;



    }


}

