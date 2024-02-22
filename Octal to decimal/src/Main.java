import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Decimal=0;
		int i=0;
		Scanner sc = new Scanner(System.in);

		int Ocatal = sc.nextInt();
		int pow =1;
		while(Ocatal > 0)
		{
		int temp = Ocatal%10;
		 Decimal = (int)(Decimal + temp*Math.pow(8,i));	
	     pow =pow*8;
		Ocatal = Ocatal/10;
		i++;
		}
		System.out.println("Decimal number : "+Decimal); 
	}

}
