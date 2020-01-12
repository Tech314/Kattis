import static java.lang.System.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class DifferentProblem {

	public static void main(String[] blargs) {

		Scanner scan = new Scanner(in);

		List<String> inputs = new ArrayList<>();

		while(scan.hasNextLine()){
			inputs.add(scan.nextLine());
		}

		inputs.forEach(s -> out.println(difference(s)));

	}

	private static int difference(String input) {
		String[] inputs = input.split(" ");

		return Math.abs(Integer.parseInt(inputs[0]) - Integer.parseInt(inputs[1]));
	}

}
