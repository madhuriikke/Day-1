package PassbyvaluepassbyReference;

import java.util.Scanner;

public class OddEvenAdd {
	int x, oddadd, evenadd, n;

	public void show(int x) {
		Scanner in = new Scanner(System.in);

		int[] a = new int[x];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter Number");
			int y = in.nextInt();
			a[i] = y;

		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {

				oddadd = oddadd + a[i];
			}
			evenadd = evenadd + a[i];

		}
		System.out.println(oddadd);
		System.out.println(evenadd);

	}

	public static void main(String[] args) {

		OddEvenAdd e = new OddEvenAdd();
		e.show(10);

	}
}
