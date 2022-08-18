package com.duplicatenumber;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		int duplicate[] = new int[] { 4,3,3,1 };
		int Length = duplicate.length;
		int missingval = 0, duplicateval = 0;

		Arrays.sort(duplicate);
		
		for (int i = 0; i < Length; i++) {
			System.out.print(duplicate[i] + " ");
		}
		System.out.println();

		// finding the duplicate value
		for (int i = 0; i < Length; i++) {

			for (int j = i + 1; j < Length; j++) {

				if (duplicate[i] == duplicate[j]) {

					duplicateval = duplicate[j];
					System.out.println("Duplicate value is: " + duplicateval);
				}

			}

		}

		// finding missing value
		if (duplicate[0] == 1) {
			for (int k = 0; k < Length; k++) {

				if (duplicate[k] != k + 1) {

					missingval = k + 1;
				}
			}

		} else {
			missingval = duplicate[0] - 1;
		}
		System.out.println("Missing value is: " + missingval);
		System.out.println("Sum of MISSING VALUE and DUPLICATE VALUE is: " + (missingval + duplicateval));
	}
}
