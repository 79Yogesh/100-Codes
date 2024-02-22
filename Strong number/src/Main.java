import java.util.*;

public class Main {
      
	static int factorial(int digit) {
		int fact = 1;
		
		if (digit == 1 || digit == 0) {
			return 1;
		}
		
		for (int i = 1; i <= digit; i++) {
			fact *= i;
		}
		
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;
		
		while (temp > 0) {
			int digit = temp % 10;
			sum += factorial(digit);
			temp = temp / 10;
		}
		
		
		
		if (num == sum) {
			System.out.println(num + " is a Strong Number");
		} else {
			System.out.println(num + " is not a Strong Number");
		}
	}
}