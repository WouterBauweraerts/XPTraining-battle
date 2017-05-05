package be.cegeka.battle;

public enum WeaponType {
    BARE_FIST("Bare Fist"),
    AXE("Axe"),
    SPEAR("Spear"),
    SWORD("Sword");


    private final String weapon;

    WeaponType(String weapon){
        this.weapon = weapon;
    }


    @Override
    public String toString() {
        return weapon;
    }
}
