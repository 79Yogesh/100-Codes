import java.util.*;
public class PositiveNegativeNo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("Positive");
		}else if(num < 0)
		{
			System.out.println("Negative");
		}
		else if(num==0){
			System.out.println("Equal");
		}
      
	}

}
