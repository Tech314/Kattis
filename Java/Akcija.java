import static java.lang.System.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Akcija {

	public static void main(String[] blargs) {

		final Scanner scan = new Scanner(in);

		int n = Integer.parseInt(scan.nextLine());

		List<Integer> prices = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			prices.add(Integer.parseInt(scan.nextLine()));
		}

		Collections.sort(prices);
		Collections.reverse(prices);

		int count = 0;
		int total = 0;
		for(Integer i : prices) {
			count++;
			if(count % 3 != 0) total += i;
		}

		out.println(total);
	}

}
