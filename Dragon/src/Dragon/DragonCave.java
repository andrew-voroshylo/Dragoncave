package Dragon;

import java.util.*;

public class DragonCave {
    public static void main(String[] args) {
        Random rand = new Random();
        int eatDragon = rand.nextInt(2)+1;
        System.out.println("You are in a land full of dragons. In front of you");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (1 or 2)");
        Scanner numCave = new Scanner(System.in);
        System.out.println("Enter cave number");
        String caveNumber = numCave.nextLine();
        try{
            int cave = Integer.parseInt(caveNumber);
            if (cave == 1) {
                if (eatDragon == 1) {
                    System.out.println("You approach the cave...");
                    System.out.println("It is dark and spooky...");
                    System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
                    System.out.println("Gobbles you down in one bite");
                }
                else {
                    System.out.println("You approach the cave...");
                    System.out.println("It is dark and spooky...");
                    System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
                    System.out.println("Spits out a large chunk of gold");
                }
            }
            if (cave == 2) {
                if (eatDragon == 2) {
                    System.out.println("You approach the cave...");
                    System.out.println("It is dark and spooky...");
                    System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
                    System.out.println("Gobbles you down in one bite");
                }
                else {
                    System.out.println("You approach the cave...");
                    System.out.println("It is dark and spooky...");
                    System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
                    System.out.println("Spits out a large chunk of gold");
                }
            }
            if ((cave != 1) && (cave != 2)) {
                System.out.println("Not a valid cave number");
            }
        }
        catch (NumberFormatException ex){
            System.out.println("Clearly not a cave number");
        }

    }

}
