package practise_java;
import java.util.Scanner;

public class start {

	public static void main(String[] args) {
		output_1.output_3();
		Output_2.output_4();
		
	
		
}

}
 class output_1{
	public static void output_3(){
	Scanner sc=new Scanner(System.in);
	int Number=sc.nextInt();
	for(int i=0;i<Number;i++) {
		System.out.println("*");
	}
	
	
}
}
 class Output_2{ 
	  public static void  output_4(){
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the number");
		  int Number_1=sc.nextInt();
	
			for(int i=0;i<Number_1;i++) {
				System.out.print("*");
				
			}

	  }
		 
	 }