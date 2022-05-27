package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
	Player p1 = new Player(100, 0, 10);

        System.out.println("You awaken after a fall in a dark cave");
        System.out.println("You have a broken sword in your hand ");
        System.out.println("type s to view your stats, type e to start encounter, type h to use a health potion, and type q to quit");
        while(p1.getHealth() > 0) {
            //p1.setHealthPotions(1);
            String answer = scan.nextLine();


                if (answer.equals("s")) {
                    System.out.println(p1.showStats());
                }

                if (answer.equals("q")){
                    break;
                }
                if (answer.equals("h")) {
                    System.out.println(p1.usePotion());
                }


                if (answer.equals("e")) {
                    Monster m = new Monster("Zombie", 50, 2, 12);
                    System.out.println("A " + m.getName() + " appears in front of you!");
                    System.out.println(m.monsterStats());
                    while (m.getHealth() > 0) {

                        System.out.println("What is your next move? Type a to attack, d to dodge, b to block, and f to flee");


                        String encounterAnswer = scan.nextLine();
                        System.out.println(m.handle(encounterAnswer));
                        if(encounterAnswer.equals("f")){
                            System.out.println("You got away safely!");
                            break;
                        }

                    }
                    if (m.getHealth() <= 0) {
                        System.out.println("You killed the " + m.getName() + "!");
                        System.out.println(p1.victory());
                        System.out.println(p1.Reward());
                    }


                }





        }
        System.out.println("Game Over!");
       // public void Encounter(Player, Monster){
         //   System.out.println("A monster appears in front of you! press a to attack d to dodge and b to block");
           // String move = scan.nextLine();
            //if(move.equals("a")){

            //}
        //}


    }
}
