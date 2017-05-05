package be.cegeka.battle.weapon;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by wouterba on 5/05/2017.
 */
public class BareFistTest {
    @Test
    public void getDamage_shouldReturnOne(){
        Weapon weapon = new BareFist();

        assertThat(weapon.getDamage()).isEqualTo(1);
    }
}