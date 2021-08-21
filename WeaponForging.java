public class WeaponForging {
    public Weapon makeWeapon(Robot enemy){
        if(enemy.getArmor() > 50 || enemy.getSpeed() > 120){
            return new Laser();
        }
        else if(enemy.getArmor() > 20 && enemy.getArmor() < 50 || enemy.getSpeed() > 60){
            return new Rifle();
        }
        else{
            return new Spear();
        }
    }
}