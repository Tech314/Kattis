import static java.lang.System.*;
import static java.lang.Math.PI;
import java.util.Scanner;

public class AnthonyDiablo {

	public static void main(String[] blargs) {

		Scanner scan = new Scanner(in);

		String input = scan.nextLine();
		String[] inputs = input.split(" ");

		out.println(happy(Double.parseDouble(inputs[0]),Double.parseDouble(inputs[1])) ? "Diablo is happy!" : "Need more materials!");

	}

	private static boolean happy(double area, double fencing) {

		double cr = fencing / (2 * PI);
		double maxArea = PI * Math.pow(cr,2);

		double minArea = (fencing - 2) / 2;

		//return ( (minArea <= area && area <= maxArea) ) ? true : false;
		return minArea <= area;
	}

}
