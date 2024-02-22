import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sum1 =0;
		int sum2 =0;
		System.out.println("Factor of num1 is :");
		for(int i=1;i <num1;i++) {
			if(num1 % i == 0) {
			sum1 += i;
			System.out.print(i+" ");
			}
			
		}
		System.out.println();
		System.out.println("Factor of num2 is :");
		for(int i=1;i <num2;i++) {
			if(num2 % i == 0) {
			sum2 += i;
			System.out.print(i+" ");
			}
		}
		 System.out.println();
          if(sum1/num1 == sum2/num2) {
        	  System.out.println("Yes, they are a friendly pair.");
          }else {
        	  System.out.println("No, they are not friendly pair.");
          }
		
	}

}
