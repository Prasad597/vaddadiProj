package com.pract.june;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	// Complete the diagonalDifference function below.
	static int diagonalDifference(int[][] a) {
		int diag1 = 0, diag2 = 0;
		for (int i = 0, j = a.length - 1; i < a.length && j >= 0; i++, j--) {
			diag1 += a[i][i];
			diag2 += a[i][j];
			System.out.println(diag1+" "+diag2);
		}
		return Math.abs(diag1 - diag2);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int[][] a = { { 1, 2, 100 }, { 1, 2, 3 }, { 1, 2, 3 } };

		int result = diagonalDifference(a);
		System.out.println(result);
	}
}
