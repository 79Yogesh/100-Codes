import java.util.*;

class SortArray implements Comparator<Integer>{
	Map<Integer, Integer> freq;
	SortArray(Map<Integer , Integer> r){
		freq = r;
	}
	
	public int compare(Integer i1,Integer i2) {
		int temp = freq.get(i2).compareTo(freq.get(i1));
		
		if(temp == 0) {
		 return i1.compareTo(i2);
		}else {
		 return temp;
		}
		
	
	}
	
	
}
public class Main {
	

	public static void main(String[] args) {
	    int[] array = { 4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5 };

		Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int ele : array) {
        	int count  = map.getOrDefault(ele, 0);
        	map.put(ele,count+1);
        	list.add(ele);	
        }
        
        SortArray comp = new SortArray(map);
       
        Collections.sort(list, comp);
        
        for(Integer get : list) {
        	System.out.print(get + " ");
        }
        
        
	}
	}


