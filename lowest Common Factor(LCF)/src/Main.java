import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc = new Scanner(System.in);
            
            int num1 =sc.nextInt();
            int num2 =sc.nextInt();
            
            int loop = Math.max(num1, num2);
            int result = 0;
            for(int i = loop ;i <=num1*num2; i++) {
            	
            	if(( i % num1 == 0) && ( i %num2== 0) ){
            		result =i;
            	    break;
            	}
            }
            System.out.println("L.C.F of "+num1+" and "+num2+" is   "+result);
            
	}

}