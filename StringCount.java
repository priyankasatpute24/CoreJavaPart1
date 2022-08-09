package com.java;


import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		int w1 = 0, s1 = 0, c1 = 0;
		String arrStr[] = str.split(" ", 3);
		for (String str1 : arrStr) {
			System.out.println(str1 + " ");
			w1++;
		}
		System.out.println("No. of words: " + w1);
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == ' ') {
				s1++;
			} else {
				c1++;
			}
		}
		System.out.println("No. of spaces: " + s1);

		System.out.println("No. of characters: " + c1);

	}

}

