package principal;
import java.util.Scanner;
public class Learnin_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Generate two random integers under 100
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user for an answer
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        // Report the result (true or false)
        boolean isCorrect = (number1 + number2 == answer);
        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + isCorrect);
        
        input.close();
	}

}
