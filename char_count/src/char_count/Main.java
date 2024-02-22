package char_count;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                  
	 String str ="yhogeshpathelh";
	  
	 Map<Character,Integer> map = new HashMap<>();
	
	 
	 for(int i=0; i < str.length();i++) {
		 
		 char ch = str.charAt(i);
		 
//		 if(map.containsKey(ch)) {
//			   int count = map.get(ch);
//				map.put(ch,++count );
//		 }else {
//			 map.put(ch,1);
//		 }
		 
		
	 }
	 
	
	
             System.out.println(map);
	}

}
