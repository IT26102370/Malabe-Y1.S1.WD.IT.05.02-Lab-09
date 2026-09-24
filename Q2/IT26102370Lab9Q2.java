import java.util.Scanner; 
public class IT26102370Lab9Q2{				//IT26102370Lab9Q2.java
	public static void main(String[]args){
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the radius of a circle ");
		double radius = input.nextDouble();
		
		System.out.println();
		
		double area=circleArea(radius);
		System.out.println("the area of a circle with radius "+ radius + " is : "+ area);
	
	}
	public static double circleArea(double radius){
		return (22.0/7.0)*radius*radius;
	}
}	