package be.cegeka.battle;

import org.apache.commons.lang3.Validate;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class Soldier {

    private String name;
    private String weapon;

    public Soldier(String name) {
        Validate.isTrue(isNotBlank(name));

        this.name = name;
        this.weapon = "Bare Fist";
    }

    String getName() {
        return this.name;
    }

    public String getWeapon() {
        return weapon;
    }
}
