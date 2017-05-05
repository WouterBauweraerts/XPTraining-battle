package be.cegeka.battle.army;

import be.cegeka.battle.soldier.Soldier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Army {
    private List<Soldier> soldiers = new ArrayList<>();

    public List<Soldier> getSoldiers() {
        return soldiers;
    }

    public void enrollSoldiers(Soldier... soldiers) {
        this.soldiers.addAll(Arrays.asList(soldiers));
    }
}
