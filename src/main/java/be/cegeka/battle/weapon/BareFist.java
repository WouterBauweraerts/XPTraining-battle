package be.cegeka.battle.weapon;

public class BareFist implements Weapon {
    @Override
    public int getDamage() {
        return 1;
    }

    @Override
    public String getDescription() {
        return "Bare Fist";
    }
}
