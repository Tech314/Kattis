import static java.lang.System.*;
import java.util.Scanner;

public class Soylent {

	public static void main(String[] blargs) {

		Scanner scan = new Scanner(in);

		int n = Integer.parseInt(scan.nextLine());
		String[] calories = new String[n];
		for(int i = 0; i < n; i++) {
			calories[i] = scan.nextLine();
		}

		for(String cal : calories) {
			out.println((int)Math.ceil(Integer.parseInt(cal) / 400.0));
		}

	}

}
