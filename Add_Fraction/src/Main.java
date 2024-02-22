import java.util.*;

public class Main {
     
	static void fraction(int numer1 , int denom1,int numer2 , int denom2) {
		int resultd,resultn;
		
		if(denom2 == denom1) {
			resultn = numer1 + numer2;
			resultd = denom1 ;
		}else {
		 resultn = numer1*denom2 + numer2*denom1;
		 resultd = denom1 * denom2;
		}
		
		System.out.println(numer1+ " / " +denom1+" + "+ numer2+" / "+denom2+" = "+resultn+" / "+resultd);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int numer1 = sc.nextInt();
		int denom1 = sc.nextInt();
		int numer2 = sc.nextInt();
		int denom2 = sc.nextInt();
		
		fraction(numer1 ,denom1,numer2 ,denom2);
		
		
		
		

	}

}
