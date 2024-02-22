
import java.util.*;

class Stack {
	private final int MAX;
	private int top;
	private char[] arr;

	Stack(int s) {
		MAX = s;
		this.top = -1;
		arr = new char[MAX];

	}

	void push(char data) {
		arr[++top] = data;
	}

	char pop() {
		char ch = arr[top];
		top--;
		return ch;
	}

	long peak() {
		return arr[top];
	}
	boolean isFull() {
		return (MAX - 1 == top);
	}
	boolean isEmpty() {
		 return top == -1;
	}

        
	void display() {
		
		for(int i =0 ; i <=top; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	

	int menu() {
		int choice;
		System.out.println("---------------------------------------------");
		System.out.println("Press 0 : Exit");
		System.out.println("Press 1 : Push ");
		System.out.println("Press 2 : Pop ");
		System.out.println("Press 3 : Check Stack Status ");
		System.out.println("Press 4 : peak Element ");
		System.out.println("Press 5 : Display ");
		System.out.println("---------------------------------------------");
		System.out.print("Enter choice : ");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		System.out.println("---------------------------------------------");
		return choice;
	}



  boolean balance(String str) {
	
      
	    for (int i = 0; i < str.length(); i++) {
         char x = str.charAt(i);
         
         if (x == '(' || x == '[' || x == '{') {
             push(x);
             continue;
         }

         
         if (isEmpty())
             return false;            
         char check;
         switch (x) {
         case ')':
             check = pop();
             if (check == '{' || check == '[')
                 return false;
             break;

         case '}':
             check = pop();
             if (check == '(' || check == '[')
                 return false;
             break;

         case ']':
             check = pop();
             if (check == '(' || check == '{')
                 return false;
             break;
         }
     }
	    
     boolean result = isEmpty();
     return (result);
 }
	

}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack S = new Stack(10);
    	Scanner sc = new Scanner(System.in);
        String s ="([{}])";
        if (S.balance(s))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");

         	}

	}





