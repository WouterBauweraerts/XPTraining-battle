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

    @Test
    public void fight_fightWithWeakerSoldier_ReturnsWouter(){
        Soldier s1 = new SoldierBuilder()
                .withName("Wouter")
                .withWeapon(new Axe())
                .build();

        Soldier s2 = new SoldierBuilder()
                .withName("Jens")
                .build();

        assertThat(s2.fight(s1)).isEqualTo("Wouter");
    }

    @Test
    public void fight_fightWithWeakerSoldier_ReturnsStijn(){
        Soldier s1 = new SoldierBuilder()
                .withName("Stijn")
                .withWeapon(new Axe())
                .build();

        Soldier s2 = new SoldierBuilder()
                .withName("Jens")
                .build();

        assertThat(s2.fight(s1)).isEqualTo("Stijn");
    }

    @Test
    public void fight_fightWithWeakerSoldier_ReturnsJens(){
        Soldier s1 = new SoldierBuilder()
                .withName("Wouter")
                .build();

        Soldier s2 = new SoldierBuilder()
                .withName("Jens")
                .withWeapon(new Axe())
                .build();

        assertThat(s2.fight(s1)).isEqualTo("Jens");
    }

    @Test
    public void fight_withEqualWeapons_returnsWouter() throws Exception {
        Soldier s1 = new SoldierBuilder()
                .withName("Wouter")
                .withWeapon(new Axe())
                .build();

        Soldier s2 = new SoldierBuilder()
                .withName("Jens")
                .withWeapon(new Axe())
                .build();

        assertThat(s1.fight(s2)).isEqualTo("Wouter");
    }
}