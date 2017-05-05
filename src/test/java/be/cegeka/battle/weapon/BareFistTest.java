package be.cegeka.battle.weapon;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BareFistTest {
    @Test
    public void getDamage_shouldReturnOne(){
        Weapon weapon = new BareFist();

        assertThat(weapon.getDamage()).isEqualTo(1);
    }
}