import static java.lang.System.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class AboveAverage {

	public static void main(String[] blargs) {

		Scanner scan = new Scanner(in);
		DecimalFormat df = new DecimalFormat("0.000");

		int n = Integer.parseInt(scan.nextLine());
		String[] inputs = new String[n];

		for(int i = 0; i < n; i++) {
			inputs[i] = scan.nextLine();
		}

		for(String s : inputs) {
			out.println(df.format(average(s.split(" "))) + "%");
		}
	}

	private static double average(String[] scores) {
		double total = 0.0;
		double average = 0.0;

		for(int i = 1; i < scores.length; i++) {
			average += Double.parseDouble(scores[i]);
		}
		average /= Double.parseDouble(scores[0]);

		for(int i = 1; i < scores.length; i++) {
			if(Double.parseDouble(scores[i]) > average) {
				total += 1;
			}
		}

		return 100 * (total/Double.parseDouble(scores[0]));
	}

}
