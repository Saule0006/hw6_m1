public class Skeleton extends Boss {
    private  int arrowCount;

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }



    @Override
    void printInfo() {
        System.out.println("Health: " + this.getHealth() + " damage: "+this.getDamage() + " weapon" + this.getWeapon().getWeaponName() +" "+ this.getWeapon().getWeaponType()+ " arrows: " + this.getArrowCount() );

    }
}
