package RPGInheritance.src.main.java;

public class Warrior extends Farmer {
    private int shieldStrength;

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, int shieldStrength){
        super(name, strength, health, stamina, speed, attackPower);
        this.shieldStrength=shieldStrength;
    }

    //additional special method for player
    public void decreaseShieldStrength(){
        shieldStrength--;

    }
    //setter and getter

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }
}
