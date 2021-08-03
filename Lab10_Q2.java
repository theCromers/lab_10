import java.util.Scanner;
public class Lab10_Q2 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter next person's information: ");
        System.out.print("height (in inches)? ");
        double height=sc.nextDouble();
        System.out.print("weight (in pounds)? ");
        double weight=sc.nextDouble();
        double bmi=bmi(height,weight);
        System.out.println("bmi= "+bmi);
        if(bmi<18.5) {
        	System.out.println("underweight");
        }
        else if(bmi>=18.5 && bmi<=24.9) {
        	System.out.println("normal");
        }
        else if(bmi>=25.0 && bmi<=29.9) {
        	System.out.println("overweight");
        }
        else if(bmi>=30.0) {
        	System.out.println("obese");
        }
    }

	private static double bmi(double height, double weight) {
		double bmi=(weight/(Math.pow(height, 2))*703);
		return bmi;
	}

	

}
