package com.mage.hl7filesscramble;

public class PatternsProgramExample {

	public static void main(String[] args) {
		int n = 8;
		PatternsProgramExample ppe = new PatternsProgramExample();
		ppe.printNumberSequencePattern(n);
		System.out.println("");
		ppe.printIneuronWord(n);
		System.out.println("");
		ppe.printInvertedPyramidPattern(n);

	}

	private void printInvertedPyramidPattern(int rowIndex) {
		int col = rowIndex * 2 - 2;
		for (int i = 0; i < rowIndex; i++) {
			for (int j = 0; j < col; j++) {
				if ((i >= j) || i + j >= col - 1 * 2 / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

	private void printNumberSequencePattern(int patternIndex) {
		for (int i = 1; i < patternIndex; i++) {
			for (int j = 1; j < patternIndex; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}

	private void printIneuronWord(int patternIndex) {
		for (int i = 0; i < patternIndex; i++) {
			for (int j = 0; j < patternIndex; j++) {
				if (i == 0 || i == patternIndex - 1 || j == (patternIndex - 1) / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < patternIndex; j++) {
				if (j == 0 || j == patternIndex - 1 || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < patternIndex; j++) {
				if (i == 0 || i == patternIndex - 1 || j == 0 || i == (patternIndex - 1) / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < patternIndex; j++) {
				if ((j == 0 && i < patternIndex - 1) || (j == patternIndex - 1 && i < patternIndex - 1)
						|| (i == patternIndex - 1 && j != 0 && j < patternIndex - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < patternIndex; j++) {
				if ((i == 0 && j < patternIndex - 1) || (j == 0)
						|| (j == patternIndex - 1 && i != 0 && i <patternIndex - 1 / 2 ) || (i == patternIndex / 2  )) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < patternIndex; j++) {
				if (i == 0 || j == patternIndex - 1 || i == patternIndex - 1 || j == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < patternIndex; j++) {
				if (j == 0 || j == patternIndex - 1 || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println("");
		}
	}
}
