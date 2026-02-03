package principal;
import java.util.Scanner;
public class LinearEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        // Prompt the user to enter a, b, c, d, e, f
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        // Calculate the denominator (ad - bc)
        double denominator = (a * d) - (b * c);

        // Check if the equation has a solution
        if (denominator == 0) {
            System.out.println("The equation has no solution");
        } else {
            // Calculate x and y using Cramer's Rule
            double x = ((e * d) - (b * f)) / denominator;
            double y = ((a * f) - (e * c)) / denominator;

            System.out.println("x is " + x + " and y is " + y);
        }

        input.close();
	}

}
