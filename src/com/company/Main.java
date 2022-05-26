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

            Monster m = new Monster(4, 8, 12);
            System.out.println(m.handle(answer));



                if (answer.equals("q")){
                    break;
                }
                if (answer.equals("h")) {
                    System.out.println(p1.usePotion());
                }
                //System.out.println(p1.showStats());

                if (answer.equals("e")) {
                    Encounter();
                }

                if (answer.equals("s")) {

                }



        }
        public void Encounter(Player, Monster){
            System.out.println("A monster appears in front of you! press a to attack d to dodge and b to block");
            String move = scan.nextLine();
            if(move.equals("a")){

            }
        }


    }
}
