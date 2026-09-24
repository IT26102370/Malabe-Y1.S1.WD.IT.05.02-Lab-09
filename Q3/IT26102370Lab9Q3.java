import java.util.Scanner;						//  javac IT26102370Lab9Q3.java
public class IT26102370Lab9Q3{ 
	public static void main(String[]args){
	
	int result1 = square(add(multiply(3,4),multiply(5,7)));
	int result2 = add(square(add(4,7)),square(add(8,3)));
	
	
	System.out.println("Result of (3*4 + 5*7)^2\t\t        :"+ result1 );
	System.out.println("Result of (4 + 7)^2 + (8 + 3)^2\t\t:"+ result2);

	}
	
	public static int add(int a,int b){
	return a + b;
	}
	
	public static int multiply(int a,int b){
	return a*b;
	}
	
	public static int square(int number){
	return number*number;
	}
	
}