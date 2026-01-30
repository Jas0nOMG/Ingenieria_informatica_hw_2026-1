package clase_2;

import java.util.Scanner;

public class ok {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
	int number1,number2,student_number;
	
	number1=(int)(System.currentTimeMillis()%10);
	number2=(int)(System.currentTimeMillis()*7%10);
	 System.out.println("What is the result of "+number1+"+"+number2+"?");
 
 Scanner  input=new Scanner(System.in);
 
 student_number=input.nextInt();
 


 
 if(student_number==number1+number2)
 {
	 System.out.println("Correct");
 }
 else {
	 
	 System.out.println("Incorrect");
 }

	}

}
