import java.util.*;


public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String str1 = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
            	
                ch = (char) (ch - 32);      
                
            }else
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            str1 += ch;
        }

        System.out.println(str1);
}
}