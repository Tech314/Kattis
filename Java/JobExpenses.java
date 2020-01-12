import static java.lang.System.*;
import java.util.Scanner;

public class JobExpenses {

	public static void main(String[] blargs) {
		Scanner scan = new Scanner(in);

		int num = Integer.parseInt(scan.nextLine());

		String vals = scan.nextLine();
		String[] values = vals.split(" ");

		int amount = 0;
		for(int i = 0; i < num; i++) {
			if(values[i].charAt(0) == '-')
				amount += -1 * Integer.parseInt(values[i]);
		}

		out.println(amount);
	}

}
