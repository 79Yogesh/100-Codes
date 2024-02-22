import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str =sc.next();
        char ch = str.charAt(0);
       
        if((ch >= 97 && ch <= 122) && (ch >=65 && ch<= 99)) {
        	System.out.println(ch + " is a alphabet");
        }else {
        	System.out.println(ch + " is not a alphabet");
        }

	}	

}
