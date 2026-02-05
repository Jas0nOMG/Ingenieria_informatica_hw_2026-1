package Principal;
import java.util.Random;
import java.util.Scanner;

public class Gn {

	public static void main(String[] args) {
		
		int guess=0;
		int min = 1;
        int max = 100;
      
        
        
        int randomNum = (int)(Math.random() * (max - min + 1) + min);
		
		
		
		
		// TODO Auto-generated method stub
        
          
		   Scanner input = new Scanner(System.in);
	       
		   System.out.print("guess the number beetween 0-100");
	      
	       while(true) {
	       guess = (int)input.nextInt();
	       
	   
	       if(randomNum==guess) 
	       {
	    	   System.out.println("you guess the number!" );
	    	   System.out.println("You won!! :D" ); 
	    	   break;
	       }
	       
	       if(guess<randomNum) 
	       {
	    	   
	    	   System.out.println("Your guess is lower than the number " ); 
	    	   System.out.println("Make another guess " ); 
	       }
	       
	       if(guess>randomNum)
	       {
	    	   System.out.println("Your guess is higher than the number " ); 
	    	   System.out.println("Make another guess " ); 
	       }
	       
	       
	       
	       
	       }
	       }
	       
	       
	       
	}


