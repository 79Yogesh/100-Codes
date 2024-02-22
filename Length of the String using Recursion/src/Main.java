public class Main
{
     
    static int recLength(String str)
    {
      
        if (str.equals(""))
            return 0;
        else
            return recLength(str.substring(1)) + 1;
    }

 
    public static void main(String[] args)
    {
        String str ="Yogesh Patel";
        System.out.println("length of the string "+recLength(str));
    }
}