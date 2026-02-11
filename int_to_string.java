package practise_java;

import java.util.Scanner;

public class int_to_string {
	
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer ASCII value : ");
        int asciiValue = scanner.nextInt();

        char character = (char) asciiValue;

        String resultString = Character.toString(character);

    
        System.out.println("The character for the ASCII value " + asciiValue + " is: " + character);
        System.out.println("The resulting String is: \"" + resultString + "\"");

        scanner.close(); 
    	
      
    }
} 