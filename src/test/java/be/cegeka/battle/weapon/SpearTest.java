package be.cegeka.battle.weapon;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SpearTest {

    @Test
    public void getDamage_shouldReturnTwo(){
        Weapon weapon = new Spear();

        assertThat(weapon.getDamage()).isEqualTo(2);
    }
}
