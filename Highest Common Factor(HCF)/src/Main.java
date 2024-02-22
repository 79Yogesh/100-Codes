import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc = new Scanner(System.in);
            
            int num1 =sc.nextInt();
            int num2 =sc.nextInt();
            
            int loop = Math.min(num1, num2);
            int result = 1;
            for(int i = 1;i <= loop;i++) {
            	
            	if((num1 % i == 0) && (num2 % i == 0) ){
            		result =i;
            	}
            }
            System.out.println("H.C.F of "+num1+" and "+num2+" is   "+result);
            
	}

}