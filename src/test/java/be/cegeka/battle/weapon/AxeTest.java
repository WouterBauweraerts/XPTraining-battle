package be.cegeka.battle.weapon;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AxeTest {
    @Test
    public void getDamage_shouldReturn3(){
        Weapon weapon = new Axe();

        assertThat(weapon.getDamage()).isEqualTo(3);
    }
}
