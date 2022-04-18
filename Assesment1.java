


import java.util.Scanner;

public class register {
     public static void main(String[] args) {
		
		
	Username();
        Password();	
		
	}  
    

public static void Username(){

    final int  NUM_LETTERS = 5;
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
        if (letterCount <= NUM_LETTERS && specialcharCount >= NUM_SPECIAL_CHAR )
	System.out.println("Username successfully captured");		
	
        
	else {
	    System.out.println("Username is not correctly formatted, ");
	    System.out.println("please ensure that the password contains no more than 5 characters and an underscore");
            }
        
        
}
public static void Password()
		{
		
		
		final int NUM_UPPER_LETTERS = 2;
		final int NUM_LOWER_LETTERS = 3;
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
			System.out.println("Password successfully captured");
		else {
			System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character");
			
		}
	}
	
}
