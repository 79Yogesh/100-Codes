import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		long num =sc.nextLong();
      
		String temp = Long.toString(num);
	
			temp= temp.replace('0', '1');
			
		
		
		num = Long.parseLong(temp);
        
		System.out.println("After Replace all 0’s with 1 in a given integer  :" +num);
	}

}
