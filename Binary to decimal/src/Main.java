import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Decimal=0;
		int i=0;
		Scanner sc = new Scanner(System.in);

		int binary = sc.nextInt();
		
		while(binary > 0)
		{
		int temp = binary%10;
		Decimal = (int)(Decimal + temp*Math.pow(2,i));	
		binary = binary/10;
		i++;
		}
		System.out.println("Decimal number : "+Decimal); 
	}

}
