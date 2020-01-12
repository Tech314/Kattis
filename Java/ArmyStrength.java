import static java.lang.System.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArmyStrength {

	public static void main(String[] blargs) {

		final Scanner scan = new Scanner(in);

		int n = Integer.parseInt(scan.nextLine());
		List<String[]> inputs = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			scan.nextLine();
			scan.nextLine();
			inputs.add(scan.nextLine().split(" "));
			inputs.add(scan.nextLine().split(" "));
		}

		for(int i = 0; i < inputs.size(); i += 2) {
			fight(inputs.get(i),inputs.get(i+1));
		}

	}

	private static void fight(String[] g, String[] m) {
		List<Integer> godzilla = new ArrayList<>();
		List<Integer> mecha = new ArrayList<>();

		for(String s : g) godzilla.add(Integer.parseInt(s));
		for(String s : m) mecha.add(Integer.parseInt(s));

		Collections.sort(godzilla);
		Collections.sort(mecha);

		int gWeakest;
		int mWeakest;

		while(godzilla.size() != 0 && mecha.size() != 0) {
			gWeakest = godzilla.get(0);
			mWeakest = mecha.get(0);

			if(gWeakest >= mWeakest) mecha.remove(0);
			else godzilla.remove(0);
		}

		out.println( (godzilla.size() == 0) ? "MechaGodzilla" : "Godzilla");

	}

}
