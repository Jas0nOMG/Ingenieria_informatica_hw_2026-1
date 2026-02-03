package principal;
import java.util.Scanner;
public class Quadratica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        // Prompt the user for a, b, and c
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Calculate the discriminant
        double discriminant = Math.pow(b, 2) - (4 * a * c);

        // Logic based on the discriminant value
        if (discriminant > 0) {
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("The equation has two roots: " + r1 + " and " + r2);
        } 
        else if (discriminant == 0) {
            double r1 = -b / (2 * a);
            System.out.println("The equation has one root: " + r1);
        } 
        else {
            System.out.println("The equation has no real roots.");
        }
        
        input.close();
	}

}
