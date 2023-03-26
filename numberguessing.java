import java.util.Scanner;

public class numberguessing {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int score = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You will have 5 chances to guess a number between 1 and 100.");
        System.out.println("Each correct guess will earn you 20 points.");
        System.out.println("Let's begin!");
        
        while(true) {
            int number = (int) (Math.random() * 100) + 1;
            int trials = 5;
            boolean GuessCorrect = false;
            System.out.println("The random is :"+number);
            
            
            while(trials > 0 && !GuessCorrect) {
                System.out.println("Guess a number (" + trials + " attempts left): ");
                int guess = sc.nextInt();
                
                
                if(guess == number) {
                    GuessCorrect = true;
                    score += 20;
                    System.out.println("Congratulations! You guessed the number.");
                    System.out.println("Your score is now: " + score);
                } else if(guess > number) {
                    System.out.println("The number is"+ " less than " + guess);
                } else {
                    System.out.println("The number is"+ " greater than " + guess);
                }
                
                trials--;
            }
            
            if(!GuessCorrect) {
                System.out.println("Sorry, you have ran out of attempts.");
                System.out.println("The number to guess was: " + number);
            }
            
            System.out.println("Do you want to play again? (y/n)");
            String playAgain = sc.next();
            
            if(playAgain.equalsIgnoreCase("n")) {
                System.out.println("Thanks for playing!");
                System.out.println("Final score: " + score);
                break;
            }
        }
        
    }

}