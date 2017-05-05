package be.cegeka.battle.weapon;

public class Axe implements Weapon {
    @Override
    public int getDamage() {
        return 3;
    }

    @Override
    public String getDescription() {
        return "Axe";
    }


}
