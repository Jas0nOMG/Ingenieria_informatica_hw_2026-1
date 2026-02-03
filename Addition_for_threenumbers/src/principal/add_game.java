package principal;
import java.util.Scanner;
public class add_game {

	public static void main(String[] args) {
		// Generate three single-digit integers (0-9)
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);

        // Create a Scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the sum
        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
        int answer = input.nextInt();

        // Calculate the actual sum and check the answer
        int correctSum = number1 + number2 + number3;
        boolean isCorrect = (answer == correctSum);

        // Display the result
        System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " + isCorrect);
        
        input.close();

	}

}
