public class Boss extends GameEntity {
    private  Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void printInfo(){
        System.out.println("Health: " + this.getHealth() + " damage: "+this.getDamage() + " weapon" + this.getWeapon().getWeaponName() +" "+ this.getWeapon().getWeaponType() );
    }
}
