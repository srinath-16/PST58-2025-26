package practise_java;
import java.util.Scanner;

public class char_to_int {

	public static void main(String[] args) {
		
		   Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter a  character : ");

	        char inputChar = scanner.next().charAt(0);

	        int intValue = inputChar - '0';

	        System.out.println("The  character is: " + inputChar);
	        System.out.println("The converted integer value is: " + intValue);

	
	        scanner.close();
	}

}
