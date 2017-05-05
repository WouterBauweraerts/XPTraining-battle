package be.cegeka.battle.weapon;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SwordTest {
    @Test
    public void getDamage_shouldReturnOne(){
        Weapon weapon = new Sword();

        assertThat(weapon.getDamage()).isEqualTo(2);
    }
}
