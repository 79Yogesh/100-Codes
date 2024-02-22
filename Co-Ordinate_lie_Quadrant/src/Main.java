import java.io.*;

public class Main {

	public static void main(String[] args) {

		int x = -3, y = -33;

		if (x > 0 && y > 0)
			System.out.println("Quadrant 1");

		else if (x < 0 && y > 0)
			System.out.println("Quadrant 2");

		else if (x < 0 && y < 0)
			System.out.println("Quadrant 3");

		else if (x > 0 && y < 0)
			System.out.println("Quadrant 4");

		else if (x == 0 && y == 0)
			System.out.println("Origin");

		else if (y == 0 && x != 0)
			System.out.println("x-axis");

		else if (x == 0 && y != 0)
			System.out.println("y-axis");

	}
}