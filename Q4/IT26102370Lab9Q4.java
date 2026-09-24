import java.util.Scanner;						//javac IT26102370Lab9Q4.java
public class IT26102370Lab9Q4{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		String[] name = new String[5];
		double[] assigmentMark = new double[5];
		double[] examPaperMark = new double[5];
		double[] finalMark = new double[5];
		char[] grade = new char[5];
		
		for(int i=0;i<5;i++){
			
			System.out.print("enter name of student" + (i+1) +": ");
			name[i] = input.nextLine();
			
			System.out.print("Enter assignment Mark (out of 100) for " + name[i] + ": ");
			assigmentMark[i] = input.nextDouble();
			
			System.out.print("Enter Exam Paper Mark (out of 100) " + name[i] + ": ");
			examPaperMark[i] = input.nextDouble();
			
			input.nextLine();
		
			System.out.println();
			
			finalMark[i] = calcFinalMark(assigmentMark[i],examPaperMark[i]);
			grade[i] = findGrades(finalMark[i]);
		}
			
			System.out.println("name\t\tfinalmark\tgarde");
			
			for( int i=0; i<5;i++){
				printDetails(name[i],finalMark[i],grade[i]);
				
			}
		
	
	
	}
	public static double calcFinalMark(double assigmentMark, double examPaperMark){
		
		return (assigmentMark * 0.3) + (examPaperMark * 0.7);                                     
		
	}

	public static char findGrades(double finalMark){
		if (finalMark >= 75){
			return 'A';
		
		}else if(finalMark >= 60 ){
			return 'B';
		
		}else if(finalMark >= 50 ){
			return 'C';
		
		}else{
			return 'F';
		
		}
	}

	public static void printDetails(String name, double finalMark, char grade){
		
		System.out.println(name + "\t\t" +  String.format("%.2f", finalMark) +"\t\t"+ grade);
		
	}
	
}