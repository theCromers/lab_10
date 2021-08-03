import java.util.Scanner;

public class Lab10_Q1 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("intput first number: ");
		int first = console.nextInt();
		System.out.print("intput second number: ");
		int second = console.nextInt();
		System.out.print("intput third number: ");
		int third = console.nextInt();
		int sum = calcSum(first, second, third);
		System.out.println("The sum of three variables is " + sum);
		double avg = calcAvg(first, second, third);
		System.out.println("The average of three variables is " + avg);
	}

	public static int calcSum(int first, int second, int third) {
		if (first < second) {
			first = first + second;
		}
		if (second < third) {
			third = third - second;
		}
		int sum = first + second + third;
		return sum;
	}

	public static double calcAvg(int first, int second, int third) {
		int add = first + second + third;
		return add / 3.0;
	}
}
