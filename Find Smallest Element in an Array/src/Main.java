import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:  ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter element of array:  ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		int min = arr[0];

		for (int i = 0; i < size; i++) {
			
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Smallest element is  " + min);
		
	}

}