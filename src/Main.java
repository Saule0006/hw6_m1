//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(50);
        boss.setWeapon(new Weapon(WeaponType.SWORD, " name"));

        boss.printInfo();

        Skeleton skeleton1 = new Skeleton();
        Skeleton skeleton2 = new Skeleton();

        skeleton1.setHealth(100);
        skeleton2.setHealth(100);
        skeleton1.setDamage(10);
        skeleton2.setDamage(10);
        skeleton1.setArrowCount(20);
        skeleton2.setArrowCount(20);
        skeleton1.setWeapon(new Weapon(WeaponType.BOW, " bow"));
        skeleton2.setWeapon(new Weapon(WeaponType.BOW, " bow"));

        skeleton1.printInfo();
        skeleton2.printInfo();
    }
}