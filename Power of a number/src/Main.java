import java.util.*;
public class Main {
	
public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	
	int base  = sc.nextInt();
	int power = sc.nextInt();
	int result =1;
	for(int i =0; i <power; i++) {
		result *=base;
	}
	
	System.out.println(+base+" ^ "+power+" is "+result);
}
}
