import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        
        //Gets the random number for the test 1-20
        Random rand = new Random();
        int num = rand.nextInt(1, 20);
        System.out.println(num);   

        int count = 0;
        Scanner scanObj = new Scanner(System.in);
        
        System.out.println("Hello! What is your name?");
        String name = scanObj.nextLine();
        
        System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20.\nTake a guess.");

        while(count <=6){
        count++;

        int guess = scanObj.nextInt(); //could add the "Take a guess." Line here
        
        
            if(guess > num){
                System.out.println("Your guess is too high.\nTake a guess");
            }

            if(guess < num){
                System.out.println("Your guess is too low.\nTake a guess");
            }

            if(guess == num){
                System.out.println("Good job, " + name + "! You guessed my number in " + count + " guesses!");
                System.out.println("Would you like to play again? (y or n)");
                
                String var = scanObj.next();

                if(var.equals("y")){
                    count = 0;
                    System.out.println("Take a guess.");

                }
                
                if(var.equals("n")){
                    break;
                }
            }

            
        }
         scanObj.close();
        System.out.println("END");


    }
    
}
