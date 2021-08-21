public abstract class Robot {
    private String name;
    private int armor;
    private int speed;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setArmor(int armor){
        this.armor=armor;
    };
    public int getArmor(){
        return armor;
    };
    public void setSpeed(int speed){
        this.speed=speed;
    };
    public int getSpeed(){
        return speed;
    };
    public void attack(Robot enemy){
        WeaponForging weaponCreation=new WeaponForging();
        Weapon weapon=weaponCreation.makeWeapon(enemy);
        System.out.println(this.name+" uses "+weapon.getName()+" to attack "+enemy.getName());
    };
}