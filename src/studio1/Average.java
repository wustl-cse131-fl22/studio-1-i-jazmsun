package studio1;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		int n1, n2;
		Scanner in = new Scanner(System.in);
		System.out.println("value for n1?");
		n1 = in.nextInt();
		System.out.println("value for n2?");
		n2 = in.nextInt();
		double average = (n1 + n2)/2.0;
		System.out.println("The average of " + n1 + " and " + n2 + " is " + average);
	}

}
