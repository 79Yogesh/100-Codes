import java.util.Scanner;
class Main{	
public static void main(String[] args)
	{
	 Scanner sc =new Scanner(System.in);
		int number = sc.nextInt();

		
		int count = 0;
		while(number != 0)
		{
			
			int temp = number % 10;
			count++;
			number = number / 10;
		}

	
		System.out.print(count);

	}
}