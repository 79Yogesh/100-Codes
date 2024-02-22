import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc =new Scanner(System.in);
         
         String str=sc.next();
         
         char ch=str.charAt(0);
         char temp =Character.toLowerCase(ch);
         if(temp == 'a' || temp == 'e' ||temp == 'i' || temp == 'o' || temp == 'u') {
        	 System.out.println(ch+" is a Vowel");
         }else if(temp >=65 && temp<= 99){
        	 System.out.println(ch+" is a Consonant");
         }else {
        	 System.out.println(ch+" is nither Vowel or Consonant");
         }
        	 
	}

}
