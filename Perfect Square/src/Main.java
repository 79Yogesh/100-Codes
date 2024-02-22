import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int temp = (int) Math.sqrt(num);

		if ((temp * temp) == num) {
			System.out.println(num + " is Peferct Square");
		} else {
			System.out.println(num + " is Not Peferct Square");
		}

	}

}
