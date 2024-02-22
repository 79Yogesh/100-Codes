
public class Main {
      static void permutation(String s,String res) {
    	  
    	  if(s.length() == 0) {
    		  System.out.println(res);
    		  return;
    	  }
    	  
    	  for(int i = 0 ; i< s.length();i++) {
    		  char ch = s.charAt(i);
    		  
    		  String temp = s.substring(0,i)+ s.substring(i+1);
    		  permutation(temp,res+ch);
    	  }
      }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str= "ABC";
       permutation(str,"");
	}

}
