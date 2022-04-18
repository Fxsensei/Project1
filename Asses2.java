Asses2


import java.util.Scanner;

public class logingIn {
    
    	public static void main(String[] args) {

    	    String Username;
    	    String Password;

    	    Password = "@Password1";
    	    Username = "M_ike";

    	    Scanner input1 = new Scanner(System.in);
    	    System.out.println("Enter Username : ");
    	    String username = input1.next();

    	    Scanner input2 = new Scanner(System.in);
    	    System.out.println("Enter Password : ");
    	    String password = input2.next();

    	    if (username.equals(Username) && password.equals(Password)) {

    	        System.out.println("Welcome " + Username +" it is great to see you again." );
    	    }

        else {
    	        System.out.println("Username or password incorrect, please try again”");
    	    }

    	}

    	
}
