package RPGInheritance.src.main.java;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
// Adding the players values for each
        Farmer farmer = new Farmer("", 75, 100, 75, 10, 1);
        Constable constable = new Constable("", 60, 100, 60, 20, 5, 3);
        Warrior warrior = new Warrior("", 75, 100, 100, 50, 10, 100);

        // Creating enemies
        String[] enemies = {"Batman", "Assassin", "Shredder", "Dark Vader"};
        int maxEnemyHealth = 90;
        int enemyAttack = 50;
        int maxEnemyStrength = 75;
        int maxEnemyStamina = 65;

        System.out.println("-------------------------------------------------");
        System.out.println("Game of Warriors!");
        System.out.println("-------------------------------------------------");
        int enemyHealth = rand.nextInt(maxEnemyHealth);
        int enemyStamina = rand.nextInt(maxEnemyStamina);
        int enemyStrength = rand.nextInt(maxEnemyStrength);
        String enemy = enemies[rand.nextInt(enemies.length)];
        System.out.println("\t* Your opponent is " + enemy + "! *\n");

        //Setting up User's name to be part of the game
        System.out.println("Enter your name: ");
        String input = scanner.nextLine();
        farmer.setName(input);
        constable.setName(input);
        warrior.setName(input);
        //Player chooses a player
        System.out.println("\t Choose your player:");
        System.out.println("\t 1. Farmer");
        System.out.println("\t 2. Constable");
        System.out.println("\t 3. Warrior");
        int playNum = scanner.nextInt();

        //Let's begin the game: setting the user to chose a player
        while (true){
            if(playNum == 1){
                System.out.println("--Let's Play " + farmer.getName() +"!" + " Farmer Style!--");
                System.out.println("\t Choose your weapon:");
                System.out.println("\t 1. Attack");
                System.out.println("\t 2. Plow");
                System.out.println("\t 3. Harvest");
                System.out.println("\t 4. Heal");
                System.out.println("\t 5. Run");
                int playNum2=scanner.nextInt();

                while (enemyHealth > 0){
                    if(playNum2 == 1) {
                        farmer.attack(enemyAttack); // player takes damage
                        farmer.decreaseHealth(); // enemy has taken damage
                        System.out.println("You have amount of health left: " + farmer.getHealth());
                        break;
                    }
                    else if(playNum2 == 2) {
                        farmer.plow(enemyStamina);
                        farmer.decreaseStamina();
                        break;
                    }
                    else if(playNum2 == 3){
                        farmer.harvest(enemyStamina);
                        farmer.decreaseStamina();
                        break;
                    }
                    else if(playNum2 ==4){
                        farmer.heal();
                        break;
                    }
                    else if(playNum2 == 5){
                        farmer.run();
                        System.out.println("Running away from the " + enemy + " so soon?");
                        break;
                    }
                    else {
                        System.out.println("Invalid Number");
                    }
                } // End of EnemyHealth Loop
                break;
            } // End of Farmer
            else if (playNum == 2) {
                System.out.println("--Let's Play " + constable.getName() + "!" + " Constable Style!--");
                System.out.println("\t Choose your weapon:");
                System.out.println("\t 1. Attack");
                System.out.println("\t 2. Arrest");
                System.out.println("\t 3. Heal");
                System.out.println("\t 4. Run");
                int playNum3 = scanner.nextInt();

                while (enemyHealth > 0) {
                    if (playNum3 == 1) {
                        constable.attack(enemyAttack); // player takes damage
                        constable.decreaseHealth(); // enemy has taken damage
                        System.out.println("You have amount of health left: " + constable.getHealth());
                        break;
                    } else if (playNum3 == 2) {
                        constable.arrest(enemyStamina);
                        constable.decreaseHealth();
                        break;
                    } else if (playNum3 == 3) {
                        constable.heal();
                        break;
                    } else if (playNum3 == 4) {
                        constable.run();
                        System.out.println("Running away from the " + enemy + " so soon?");
                        break;
                    } else {
                        System.out.println("Invalid Number");
                        break;
                    }
                } // End of Constable
                break;
            }
            else if (playNum == 3) {
                System.out.println("--Let's Play " + warrior.getName() + "!" + " Warrior Style!--");
                System.out.println("\t Choose your weapon:");
                System.out.println("\t 1. Attack");
                System.out.println("\t 3. Heal");
                System.out.println("\t 4. Run");
                int playNum4 = scanner.nextInt();

                while (enemyHealth > 0) {
                    if (playNum4 == 1) {
                        warrior.attack(enemyAttack); // player takes damage
                        warrior.decreaseHealth(); // enemy has taken damage
                        warrior.decreaseShieldStrength();
                        System.out.println("You have amount of health left: " + warrior.getHealth());
                        System.out.println("You have amount of ShieldStrength left: " + warrior.getShieldStrength());
                        break;
                    } else if (playNum4 == 2) {
                        warrior.heal();
                        break;
                    } else if (playNum4 == 3) {
                        warrior.run();
                        System.out.println("Running away from the " + enemy + " so soon?");
                        break;
                    } else {
                        System.out.println("Invalid Number");
                        break;
                    }
                }
                break;
                // The if statement is meant to take you back to the beginning of the game.
                // Conditional statement is not working keeping this for the near future to fix
//                    if (constable.getHealth() > 1) {
//                        System.out.println("Your too weak to continue. Play again.");
//                    }
            } // End of Warrior
        } //End of while Loop
        System.out.println("Thanks for Playing!" + " Refresh to Play Again.");
    } // End of Main
}
