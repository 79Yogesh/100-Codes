import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int num = sc.nextInt();
		int digit = sc.nextInt();
		
		int temp = num;
		int count=0;
		
		while(temp > 0) {
		int res =  temp%10;
		if(res ==  digit) {
			count++;
		}
		
		temp/= 10;
		}
    
		
		System.out.println(digit+" accur in "+num+" is "+count+" time");
	}

}
