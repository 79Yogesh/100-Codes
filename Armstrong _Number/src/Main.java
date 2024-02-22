
import java.util.Scanner;

class Main
{
	
	static int getLength(int num) {
        int len = 0;
        while (num!=0)
        {
            len++;
            num = num/10;
        }
        return len;
}
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range : ");
        int num1= sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Armstrong numbers between "+ num1 + " and " + num2+ " are : ");

        for(int num =  num1 ; num <=  num2 ; num++)
        {
            int sum = 0, temp, digit, len;

            len = getLength(num);
            temp = num;
   
            while(temp != 0)
            {
          
                digit = temp % 10;

                sum = sum + (int) Math.pow(digit,len);
                temp /= 10;
            };

            if(sum == num)
                System.out.print(num + " ");
        }

    }

   
}