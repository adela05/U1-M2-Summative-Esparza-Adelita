package RPGInheritance.src.main.java;

public class Constable extends Farmer {
    private int jurisdiction;

    //Constructor
    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, int jurisdiction){
        super(name, strength, health, stamina, speed, attackPower);
        this.jurisdiction = jurisdiction;
    }
    public void arrest(int enemy){
        int result = jurisdiction - enemy;
        System.out.println("Enemy's Damage: " + result);
    }

    // setter and getter

    public int getJurisdiction() {
        return jurisdiction;
    }
    public void setJurisdiction(int jurisdiction) {
        this.jurisdiction = jurisdiction;
    }
}
