package principal;
import java.util.Scanner;
public class overlap_ornot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        // Input for Rectangle 1
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();

        // Input for Rectangle 2
        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();

        // Calculate absolute differences between centers
        double xDistance = Math.abs(x1 - x2);
        double yDistance = Math.abs(y1 - y2);

        // Check if r2 is inside r1
        if ((xDistance + w2 / 2 <= w1 / 2) && (yDistance + h2 / 2 <= h1 / 2)) {
            System.out.println("r2 is inside r1");
        } 
        // Check if r2 overlaps r1
        else if ((xDistance <= (w1 + w2) / 2) && (yDistance <= (h1 + h2) / 2)) {
            System.out.println("r2 overlaps r1");
        } 
        else {
            System.out.println("r2 does not overlap r1");
        }

        input.close();

	}

}
