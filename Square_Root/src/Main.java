import java.util.*;

public class Main {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
	    int a= sc.nextInt();
	    int b= sc.nextInt();
	    int c= sc.nextInt();
	    
	    double denom = b*b - 4*a*c;
	    
	    if(denom == 0) {
	    	
	    	double r1  = -b/ (2.0 *a);
	    	System.out.println("First root : "+r1);
	    }else if(denom > 0) {
	    	
	    double r1 = -b + Math.sqrt(denom)/ (2.0*a);
	    double r2 = -b - Math.sqrt(denom)/ (2.0*a);
	    System.out.println("First root  : "+r1);
	    System.out.println("Second root : "+r2);
	    }
	    else {
	    	System.out.println("No root");
	    }
	}

}
