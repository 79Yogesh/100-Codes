
import java.io.*;
import java.util.*;

class Main {

	static char temp;

	static String remove(String str) {

		if (str.length() == 0 || str.length() == 1)
			return str; 

		if (str.charAt(0) == str.charAt(1)) {
			temp = str.charAt(0);
			while (str.length() > 1 && str.charAt(0) == str.charAt(1)) {
				str = str.substring(1, str.length());
			}
			    str = str.substring(1, str.length());
			return remove(str);                               //acaaabbbacdddd
		
		}
       
		String rem_str = remove(str.substring(1, str.length()));

		if (rem_str.length() != 0 && rem_str.charAt(0) == str.charAt(0)) {
			temp = str.charAt(0);
			return rem_str.substring(1, rem_str.length());
		}
		if (rem_str.length() == 0 && temp == str.charAt(0))
			return rem_str;
		return (str.charAt(0) + rem_str);
	}

	public static void main(String args[]) {

		String str = "acaaabbbacdddd";
		System.out.println(remove(str));
	}
}
