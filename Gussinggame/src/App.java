//importing the required classes.
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {

//Assigning the required integers.
int answer, guess, score,i;
int k = 5;
score = 50;

//Assigning the classes.
Scanner input = new Scanner(System.in);
Random rand = new Random();
answer = rand.nextInt(101);

//Instructions and heading of the game.
System.out.println("!!!Gussing Game!!!");

//looping.
for (i = 0; k > i; i++) {

while (true) {
    
System.out.print("Enter your guess between 1 - 100 : ");
guess = input.nextInt();


if (answer == guess ) {
    System.out.println("Congratulations, you have guessed the right answer.");
    System.out.println("Score: " + score);
    System.exit(0);
}

else if (guess > answer  && i != k ) {
    System.out.println("You have guessed too high");
    k = k - 1;
    score = (score - 10);
}

else if (guess < answer  && i != k ) {
    System.out.println("You have guessed too low ");
    k = k - 1;
    score = (score - 10);
}

else if (i == k  && guess != answer  ) {
    System.out.println("You have reached the maximum number of attemps");
    System.out.println("The number is : " + answer);
    System.out.println("Score : " + score);
    break;
}

else {
    System.out.println("Invalid input.");
}
    }
input.close();
}
}
}
		
