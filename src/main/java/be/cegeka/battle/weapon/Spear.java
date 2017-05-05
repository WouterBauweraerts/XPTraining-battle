package be.cegeka.battle.weapon;

public class Spear implements Weapon {
    @Override
    public int getDamage() {
        return 2;
    }

    @Override
    public String getDescription() {
        return "Spear";
    }
}
