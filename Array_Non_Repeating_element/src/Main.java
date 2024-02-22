
import java.util.*;

public class Main {

	public static void main(String[] args) {
		int nums[] = {10, 30, 40, 20, 10, 20, 50, 10}; 
		   
		boolean chk;
		    
		    for(int i=0;i<nums.length;i++) {
		    	
		        chk = true;
		        for(int j=0;j<nums.length;j++) {
		            if(i!=j && nums[i] == nums[j]) {
		                chk = false;
		                break;
		            }
		        }
		        
		        if(chk) 
		        	System.out.println(nums[i]);
		    }
		}
	}


