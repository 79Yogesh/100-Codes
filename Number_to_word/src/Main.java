public class Main {

	static void number_to_word(char[] arr) {

		String[] ones = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
		String[] teens = { "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
				"Eighteen", "Nineteen" };
		String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
		String[] hundreds = { "hundred", "Thousand" };

		int len = arr.length;

		if (len == 1) {
			System.out.println(ones[arr[0] - '0']);
			return;
		}

		int temp = 0;
		while (temp < arr.length) {
			  
			if (len >= 3) {
				if (arr[temp] - '0' != 0) {
					System.out.print(ones[arr[temp] - '0'] + " ");
  
					System.out.print(hundreds[len - 3] + " ");
				}
				--len;
			}

			else {
    
				if (arr[temp] - '0' == 1) {
 
					int sum = arr[temp] - '0' + arr[temp + 1] - '0';
					System.out.println(tens[sum]);
					return;
				}

				else if (arr[temp] - '0' == 2 && arr[temp + 1] - '0' == 0) {
    
					System.out.println("Twenty");
					return;
				}
				else {
					int i = (arr[temp] - '0');
					if (i > 0)

						System.out.print(tens[i] + " ");
					else
  
						System.out.print("");
 
					++temp;
  
					if (arr[temp] - '0' != 0)
 
						System.out.println(ones[arr[temp] - '0']);
				}
			}

			++temp;
		}
	}


	public static void main(String[] args) {
		number_to_word("673".toCharArray());
	}
}
