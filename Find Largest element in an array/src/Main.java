import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:  ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter element of array:  ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		int  max = arr[0];

		for (int i = 0; i < size; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Largest element is  " + max);
		
	}

}