package RPGInheritance.src.main.java;

public class Farmer {
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;

    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }

    // Methods - Trying to have my methods perform some action to the characters
    public void run(){
        speed--;
    }
    public void attack(int enemy){
        int result = attackPower - enemy;
        System.out.println("Enemy's Damage: " + result);

    }
    public void heal(){
        int healing = 2;
        if(healing > 0){
            health += healing;
            healing --;
            System.out.println("Your current Health is " + health);
        }
        else {
            System.out.println("No more left!");
        }
    }
    public void plow(int enemy){
        int result = stamina - enemy;
        System.out.println("Enemies total stamina: " + enemy);

    }
    public void harvest(int enemy){
        int result = stamina - enemy;
        System.out.println("Enemies total stamina: " + enemy);
    }
    //Additional methods
    public void decreaseHealth(){
        this.health--;
    }
    public void decreaseStamina(){
        stamina--;
        System.out.println("Your current stamina is: " + stamina);
    }
    public void increaseStamina(){
        stamina++;
        System.out.println("You stamina gained " + stamina);
    }


    //setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        stamina = 75;
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
