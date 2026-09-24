import java.util.Scanner; 
public class IT26102370Lab9Q1{				//IT26102370Lab9Q1.java
	public static void main(String[]args){
		
		Scanner input=new Scanner(System.in);
		
		double a,b,c;
		
		System.out.print("Enter value a: ");
		a=input.nextDouble();
		
		System.out.print("Enter value b: ");
		b=input.nextDouble();
		
		System.out.print("Enter value c: ");
		c=input.nextDouble();
	
		System.out.println();
		
		if (a == 0) {
            
			System.out.println("This is not a quadratic equation.");
        
		} else {
            
			double discriminant = Math.pow(b, 2) - 4 * a * c;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

                System.out.println("Roots are real and different:");
                System.out.printf("Root 1: %.2f%n", root1);
                System.out.printf("Root 2: %.2f%n", root2);

            } else if (discriminant == 0) {
                double root = -b / (2 * a);

                System.out.println("Roots are real and equal:");
                System.out.printf("Root 1: %.2f%n", root);
                System.out.printf("Root 2: %.2f%n", root);

            } else {
                System.out.println("Roots are not real.");
            }
        }
		
	
	}

}	