package week1.homeassignment;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int a[] = { 1, 4, 3, 2, 8, 6, 7 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] != i) {
				System.out.println(i);
				break;
			}
		}
	}
}
