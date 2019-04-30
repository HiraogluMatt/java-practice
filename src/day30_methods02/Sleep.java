package day30_methods02;

import java.util.*;

public class Sleep {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] inhabitants = { 3, 6, 0, 4, 3, 2, 7, 0 };

		// TODO. Write you code below this line.
		int i = 0;

		boolean a = false;
		boolean b = false;
		boolean c = false;
		boolean d = false;
		boolean e = false;
		boolean f = false;
		boolean g = false;
		boolean h = false;

		while ((((!a || !b) || (!c || !d)) || (!e || !f)) || (!g || !h)) {

			if (a) {
				inhabitants[1] = inhabitants[1] / 2;
			}
			if (b) {
				inhabitants[0] = inhabitants[0] / 2;
				inhabitants[2] = inhabitants[2] / 2;
			}
			if (c) {
				inhabitants[1] = inhabitants[1] / 2;
				inhabitants[3] = inhabitants[3] / 2;
			}
			if (d) {
				inhabitants[2] = inhabitants[2] / 2;
				inhabitants[4] = inhabitants[4] / 2;
			}
			if (e) {
				inhabitants[3] = inhabitants[3] / 2;
				inhabitants[5] = inhabitants[5] / 2;
			}
			if (f) {
				inhabitants[4] = inhabitants[4] / 2;
				inhabitants[6] = inhabitants[6] / 2;
			}
			if (g) {
				inhabitants[5] = inhabitants[5] / 2;
				inhabitants[7] = inhabitants[7] / 2;
			}
			if (h) {
				inhabitants[6] = inhabitants[6] / 2;
			}

			System.out.println("Day " + i + Arrays.toString(inhabitants));
			i++;

			if (inhabitants[0] == 0) {
				a = true;
			}
			if (inhabitants[1] == 0) {
				b = true;
			}
			if (inhabitants[2] == 0) {
				c = true;
			}
			if (inhabitants[3] == 0) {
				d = true;
			}
			if (inhabitants[4] == 0) {
				e = true;
			}
			if (inhabitants[5] == 0) {
				f = true;
			}
			if (inhabitants[6] == 0) {
				g = true;
			}
			if (inhabitants[7] == 0) {
				h = true;
			}

		}

	}
}
