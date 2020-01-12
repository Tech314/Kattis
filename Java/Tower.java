import static java.lang.System.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Tower {

	public static void main(String[] blargs) {

		final Scanner scan = new Scanner(in);

		String input = scan.nextLine();
		String[] vals = input.split(" ");

		int[] boxes = new int[6];
		for(int i = 0; i < 6; i++) {
			boxes[i] = Integer.parseInt(vals[i]);
		}

		List<Integer> ins = Arrays.asList();
		Collections.sort(ins);
		Collections.reverse(ins);

		organize(ins,Integer.parseInt(vals[6]),Integer.parseInt(vals[7]));

	}

	private static void organize(List<Integer> boxes, int t1, int t2) {

		int[] output = new int[6];

		int[][] combos = {{0,1,2},{0,1,3},{0,1,4},{0,1,5},
				  {0,2,3},{0,2,4},{0,2,5},
				  {0,3,4},{0,3,5},
				  {0,4,5},
				  {1,2,3},{1,2,4},{1,2,5},
				  {1,3,4},{1,3,5},
				  {1,4,5},
				  {2,3,4},{2,3,5},
				  {2,4,5},
			 	  {3,4,5}};

		for(int i = 0; i < combos.length; i++) {
			if(boxes.get(combos[i][0]) + boxes.get(combos[i][1]) + boxes.get(combos[i][2]) == t1) {
				output[2] = boxes.remove(combos[i][2]);
				output[1] = boxes.remove(combos[i][1]);
				output[0] = boxes.remove(combos[i][0]);
				break;
			}
		}

		for(int i = 3; i < 6; i++) {
			output[i] = boxes.remove(0);
		}

		out.println(Arrays.toString(output));

	}

}
