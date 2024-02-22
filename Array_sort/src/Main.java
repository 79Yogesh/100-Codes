
public class Main {
	public static void main(String[] args) {

		int[] arr = { 5, 4, 3, 2, 1 };
		int temp = 0;
		int len = arr.length;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
