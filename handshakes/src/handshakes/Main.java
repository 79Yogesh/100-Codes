package handshakes;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter total no of Person      :");
        int n = sc.nextInt();
        
        int handShake = (n * (n - 1))/2;
        
        System.out.println("Total handshake "+handShake+" by "+n+" people");
        
       
        
		
	}

}
