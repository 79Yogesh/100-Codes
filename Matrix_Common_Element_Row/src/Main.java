class Main
{
   
    public static void main(String args[])
    {
        int mat[][] = {{10, 30, 20, 40},
                       {15, 25, 20, 30},
                       {27, 30, 20, 48},
                       {20, 33, 39, 30}};
        
        int N=4, M=4;
        
        for (int j = 0; j < N; j++){   
            int x = mat[0][j];
            int count = 0;
            
            for (int i = 1; i < M; i++){
                int temp = 0;
                    for(int k = 0; k < N; k++){
                        if(x  == mat[i][k]){
                            temp = 1;
                            mat[i][k] = -1;
                            break;
                        }        
                    }
                if(temp ==1){
                    count++;   
            }
        }
        
        if (count == M-1)
           System.out.println(x);
         
            
        }
    }
}