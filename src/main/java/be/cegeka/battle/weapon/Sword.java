package be.cegeka.battle.weapon;

public class Sword implements Weapon {
    @Override
    public int getDamage() {
        return 2;
    }

    @Override
    public String getDescription() {
        return "Sword";
    }
}
