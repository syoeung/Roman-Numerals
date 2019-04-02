/* Pseudo Code
 	Purpose - Using if else statements to print number within range of 1 through 10
 	Input - Integer
 	Processing - Call to println
 	Output - Display a correct message or error message
 */

/* Pseudo Code
 	Purpose - Using if else & case statements , loops  to print number within range of 1 through 10
 	Input - Integer
 	Processing - CASE statement to determine corresponding roman numeral
 	Output - Display a correct message or error message
 */



import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		
		for (int i = 0; i <= 10 ; i ++) {	
		System.out.println("Enter a number within the range of 1 through 10 to find its roman numeral.");
		
		int input = number.nextInt();
		 
		

		if (input >= 1 || input <= 10) {
			
		String romanNumeral = "";
		
		switch (input) {
		case 1:
			romanNumeral = "I";
		case 2:
			romanNumeral = "II";
		case 3:
			romanNumeral = "III";
		case 4:
			romanNumeral = "IIII";
		case 5:
			romanNumeral = "V";
		case 6:
			romanNumeral = "VI";
		case 7:
			romanNumeral = "VII";
		case 8:
			romanNumeral = "VIII";
		case 9:
			romanNumeral = "IX";
		case 10:
			romanNumeral = "X";
			
		case 1-10:
	    	System.out.println("The roman numeral of " + input + " is " + romanNumeral);
	    	System.out.println("-----------------------------------------------------------------------");
	    	break;
		}  
		
		if (input < 1 || input >10) {
			System.out.println("The roman numeral of " + input + " is not available" );
		      System.out.println("Only numbers within the range of 1 through 10 is available.");
		      System.out.println("-----------------------------------------------------------------------");
		}
		
//	Using only If Else Statement		
//		
//		if (input == 1) {
//			romanNumeral = "I";
//         System.out.println("The roman numeral of " + input + " is " + romanNumeral);
//         System.out.println("-----------------------------------------------------------------------");
//		} else if(input == 2) {
//         romanNumeral = "II";
//         System.out.println("The roman numeral of " + input + " is " + romanNumeral);
//         System.out.println("-----------------------------------------------------------------------");
//      } else if(input == 3) {
//         romanNumeral = "III";
//         System.out.println("The roman numeral of " + input + " is " + romanNumeral);
//         System.out.println("-----------------------------------------------------------------------");
//      } else if(input == 4) {
//         romanNumeral = "VI";
//         System.out.println("The roman numeral of " + input + " is " + romanNumeral);
//         System.out.println("-----------------------------------------------------------------------");
//      } else if(input == 5) {
//         romanNumeral = "VI";
//         System.out.println("The roman numeral of " + input + " is " + romanNumeral);
//         System.out.println("-----------------------------------------------------------------------");
//      } else if(input == 6) {
//         romanNumeral = "VI";
//         System.out.println("The roman numeral of " + input + " is " + romanNumeral);
//         System.out.println("-----------------------------------------------------------------------");
//      } else if(input == 7) {
//         romanNumeral = "VII";
//         System.out.println("The roman numeral of " + input + " is " + romanNumeral);
//         System.out.println("-----------------------------------------------------------------------");
//      } else if(input == 8) {
//         romanNumeral = "VIII";
//         System.out.println("The roman numeral of " + input + " is " + romanNumeral);
//         System.out.println("-----------------------------------------------------------------------");
//      } else if(input == 9) {
//         romanNumeral = "IX";
//         System.out.println("The roman numeral of " + input + " is " + romanNumeral);
//         System.out.println("-----------------------------------------------------------------------");
//      } else if(input == 10) {
//         romanNumeral = "X";
//         System.out.println("The roman numeral of " + input + " is " + romanNumeral);
//         System.out.println("-----------------------------------------------------------------------");
//      }
      
        
		}
		
		}
		
		
		System.exit(0); 
	}
}
	
