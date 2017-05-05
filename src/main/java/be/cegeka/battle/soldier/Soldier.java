package be.cegeka.battle.soldier;

import be.cegeka.battle.weapon.BareFist;
import be.cegeka.battle.weapon.Weapon;
import org.apache.commons.lang3.Validate;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class Soldier {

    private String name;
    private Weapon weapon;

    public Soldier(String name) {
        Validate.isTrue(isNotBlank(name));

        this.name = name;
        this.weapon = new BareFist();
    }

    public Soldier(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    String getName() {
        return this.name;
    }

    public String getWeapon() {
        return weapon.getDescription();
    }
}
