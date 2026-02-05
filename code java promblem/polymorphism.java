package practise_java;

public class polymorphism {

	public static void main(String[] args) {
		int a=10,b=20;
	     System.out.println( method_1(a,b)); 
	     System.out.println( method_2(a,b));
	     System.out.println( method_3(a,b));
	     System.out.println( method_4(a,b));
	}
public static  int method_1(int c,int d) {
	return c+d;
}
public static int method_2(int c,int d) {
	return c-d;
}
public static int method_3(int c,int d) {
	return c*d;
}
public static int method_4(int c,int d) {
	return c%d;
}

}
