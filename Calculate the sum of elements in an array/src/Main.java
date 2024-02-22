import java.util.*;


public class Main {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of  Array :  ");
	int size =sc.nextInt(),sum =0;;
	int[] arr=new int[size];
	System.out.println("Enter element of Array :  ");
	
	for(int i =0; i < size;i++)
	{
		arr[i] = sc.nextInt();
		sum += arr[i];
	}
	
	System.out.println("Sum of Array is   :  "+sum);
}
}
