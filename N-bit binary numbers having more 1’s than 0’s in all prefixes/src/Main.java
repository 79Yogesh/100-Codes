import java.io.*;
 
class Main {
    static void printRec(String number, int extraOnes, int remainingPlaces)
    {
        if (0 == remainingPlaces) {
            System.out.print(number + " ");
            return;
        }
 
        printRec(number + "1", extraOnes + 1, remainingPlaces - 1);
 
        if (0 < extraOnes)
            printRec(number + "0", extraOnes - 1, remainingPlaces - 1);
    }
 
    static void printNums(int n)
    {
        String str = "";
        printRec(str, 0, n);
    }
 
    public static void main(String[] args)
    {
        int n = 4;
       
        printNums(n);
    }
}