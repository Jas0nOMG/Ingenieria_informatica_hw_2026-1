package principal;
import java.util.Scanner;

public class ft_inches_to_cm {

	public static void main(String[] args) {
		// llll
		
		   int feet=0; //variable to store feet
		   int inches=0; //variable to store inches
		   int totalInches=0; //variable to store total inches
           double centimeters=0; //variable to store length in centimeters
           
           
            final double CENTIMETERS_PER_INCH = 2.54;
            final int INCHES_PER_FOOT = 12;
 
           
          
           
           Scanner input = new Scanner(System.in);
           System.out.print("Enter ft and inches ");
           feet = (int)input.nextDouble();
           inches = (int)input.nextDouble();
           
           totalInches = (12 * feet) + inches;
           
           centimeters = totalInches * 2.54;
           
           System.out.println("Your length in cm is:" + centimeters);
		
		
	}

}
