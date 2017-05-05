package be.cegeka.battle.soldier;

import be.cegeka.battle.weapon.Axe;
import be.cegeka.battle.weapon.BareFist;
import be.cegeka.battle.weapon.Spear;
import be.cegeka.battle.weapon.Sword;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SoldierTest {

    @Test
    public void construction_ASoldierMustHaveAName() {
        Soldier soldier = new Soldier("name", new BareFist());

        assertThat(soldier.getName()).isEqualTo("name");
        assertThat(soldier.getWeapon()).isEqualTo("Bare Fist");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeNull() {
        new Soldier(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeEmpty() {
        new Soldier("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeBlank() {
        new Soldier("   ");
    }

    @Test
    public void construction_givenWeaponSword_getWeaponReturnsSword(){
        Soldier s = new Soldier("Wouter", new Sword());
        assertThat(s.getWeapon()).isEqualTo("Sword");
    }

    @Test
    public void construction_givenWeaponAxe_getWeaponReturnsAxe(){
        Soldier s = new Soldier("Wouter", new Axe());
        assertThat(s.getWeapon()).isEqualTo("Axe");
    }

    @Test
    public void construction_givenWeaponSpear_getWeaponReturnsSpear(){
        Soldier s = new Soldier("Wouter", new Spear());
        assertThat(s.getWeapon()).isEqualTo("Spear");
    }


}