import java.util.*;
 
class Main{
 
    
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
    	int arr[][] = new int[3][3];
    	
    	
    	for(int i=0; i < arr.length;i++)
    	{
    		for(int j=0; j < arr.length;j++) {
    			arr[i][j] = sc.nextInt();
    		}
    	}
    	int n= arr.length;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
               
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
                
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-j-1];
                arr[i][n-j-1] = temp;
            }
        }
    
       
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        
    }
}