package be.cegeka.battle.army;

import be.cegeka.battle.soldier.Soldier;
import be.cegeka.battle.soldier.SoldierBuilder;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class ArmyTest {
    @Test
    public void createArmy_ListOfSoldiers_IsNotNull(){
        Army army = new Army();
        Assertions.assertThat(army.getSoldiers()).isNotNull();
    }

    @Test
    public void enrollSoldiers_ListContainsSoldiersInRightOrder(){
        Army army = new Army();
        Soldier wouter = new SoldierBuilder().withName("Wouter").build();
        Soldier jens = new SoldierBuilder().withName("Jens").build();
        Soldier stijn = new SoldierBuilder().withName("Stijn").build();

        army.enrollSoldiers(wouter, jens, stijn);

        Assertions.assertThat(army.getSoldiers()).containsExactly(wouter, jens, stijn);
    }

    @Test
    public void enrollSoldiers_addTwoSoldiers_ListContainsSoldiersInRightOrder(){
        Army army = new Army();
        Soldier wouter = new SoldierBuilder().withName("Wouter").build();
        Soldier jens = new SoldierBuilder().withName("Jens").build();

        army.enrollSoldiers(wouter, jens);

        Assertions.assertThat(army.getSoldiers()).containsExactly(wouter, jens);
    }
}
