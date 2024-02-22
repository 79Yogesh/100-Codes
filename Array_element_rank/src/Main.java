

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int arr[] = {41, 21, 82, 32, 2, 73, 90};
        int result[] = new int[arr.length];

        
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length - 1; j++) {
                if (result[j] < result[j + 1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }

       
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (result[j] == arr[i]) {
                    arr[i] = j + 1;
                    break;
                }
            }
        }

        
       
       
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

