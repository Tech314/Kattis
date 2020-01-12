import static java.lang.System.*;
import java.util.Scanner;

public class Ahh {

	public static void main(String[] blargs) {
		Scanner scan = new Scanner(in);

		String john = scan.nextLine();
		String doctor = scan.nextLine();

		out.println( (john.length() >= doctor.length()) ? "go" : "no");
	}

}
