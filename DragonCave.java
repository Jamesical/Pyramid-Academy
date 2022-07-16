import java.util.Scanner;

public class DragonCave {


public static void main(String[] args) {

    System.out.println("You are in a land full of dragons. In front of you,\nyou see two caves. In one cave, the dragon is friendly\nand will share his treasure with you. The other dragon\nis greedy and hungry and will eat you on sight.\nWhich cave will you go into? (1 or 2)");
    Scanner input = new Scanner(System.in);


    int choice = input.nextInt(); 

    if (choice == 1){
        System.out.println("You approach the cave...\nIt is dark and spooky...\nA large dragon jumps out in front of you! He opens his jaws and...\nGobbles you down in one bite!");
    }

    if (choice == 2){
        System.out.println("You approach the cave...\nIt is dark and spooky...\nA large dragon jumps out in front of you! He opens his jaws and...\nlaughs! Then you get a large sum of gold, hooray!");
    }

    input.close();
}

}