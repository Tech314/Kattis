import static java.lang.System.*;
import java.util.Scanner;
import java.util.Arrays;

public class AlienNumbers {

	public static void main(String[] blargs) {

		Scanner scan = new Scanner(in);

		int n = Integer.parseInt(scan.nextLine());
		String[] inputs = new String[n];

		for(int i = 0; i < n; i++) {
			inputs[i] = scan.nextLine();
		}

		for(int i = 0; i < n; i++) {
			String[] params = inputs[i].split(" ");
			//out.println(Arrays.toString(params));
			out.println("Case #" + (i+1) + ": " + convert(params[0],params[1],params[2]));
		}

	}

	private static String convert(String number, String source, String target) {
		char[] num = number.toCharArray();

		int j = 0;
		int value = 0;
		for(int i = num.length - 1; i >= 0; i--) {
			value += source.indexOf(num[i]) * Math.pow(source.length(),j);

			j++;
		}

		StringBuilder output = new StringBuilder("");
		while(value != 0) {
			output.append(target.charAt(value%target.length()));
			value /= target.length();
		}

		return output.reverse().toString();
	}

}
