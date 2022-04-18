Asses3


import java.util.Scanner;


 public class registerUser {
    
public static void main(String[] args) {
	
    Username();
	Password();	
}
public static boolean Username()
		{
		
			
final int NUM_LETTERS = 5;
final int NUM_SPECIAL_CHAR =1;
int letterCount = 0;
int specialcharCount=0;
			
			
Scanner userInput = new Scanner(System.in);
System.out.println("Enter Username with underscore ");						// Prints the word "Password" to the screen
String username = userInput.next();
int inputLen1 = username.length();
			

	for(int i=0;i<inputLen1;i++) {
	char ch = username.charAt(i);
	if (Character.isLetter(ch))
	      letterCount++;
	    else { 
	           specialcharCount++;
			}
			}
			if (letterCount >= NUM_LETTERS && specialcharCount >= NUM_SPECIAL_CHAR )
				System.out.println("Username successfully captured");		
		
			
				else {
					System.out.println("The username is incorrectly formatted ");
				      
                        }
                        return true;
                }
			
public static boolean Password()
		{
		
		
		final int NUM_UPPER_LETTERS = 1;
		final int NUM_LOWER_LETTERS = 1;
		final int NUM_DIGITS =1;
		int upperCount = 0;
		int lowerCount = 0;
		int digitCount = 0;
		int letterCount = 0;
		int specialChar = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your Password");
		String input = in.nextLine();
		int inputLen = input.length();
		
		for(int i=0;i<inputLen;i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch))
				upperCount++;
			else if (Character.isLowerCase(ch))
				lowerCount++;
			else if(Character.isDigit(ch))
				digitCount++;
			
				;
		}
		if (upperCount >= NUM_UPPER_LETTERS && lowerCount >= NUM_LOWER_LETTERS && digitCount >= NUM_DIGITS)
			System.out.println("Password successfully captured  &" +
                                " The two above conditions have been met and the user has been registered successfully.");
                
		else {
			System.out.println("The password does not meet the complexity requirements.");
			
                       
                        

		}
               return true;
                }


}