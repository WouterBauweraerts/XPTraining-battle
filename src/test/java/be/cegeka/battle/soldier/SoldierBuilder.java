package be.cegeka.battle.soldier;

import be.cegeka.battle.weapon.BareFist;
import be.cegeka.battle.weapon.Weapon;

public class SoldierBuilder {
    private String name = "Some Soldier";
    private Weapon weapon = new BareFist();

    public SoldierBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public SoldierBuilder withWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }

    public Soldier build(){
        return new Soldier(name, weapon);
    }

}
