package com.java;

public class StringBufferOperation {

	public static void main(String[] args) {
//		StringBuffer sb = new StringBuffer("Programming");
//		StringBuffer str1 = sb.append(" in Java!");
//		int i = sb.capacity();
//		System.out.println("New string is: " + str1);
//		System.out.println("Capacity of string is: " + i);
//		System.out.println("Length of string is: " + str1.length());
//		System.out.println("index of string is: " + str1.indexOf("gr"));
//		System.out.println("Insert in String: " + str1.insert(15, "Angular"));
//		System.out.println("delete from String is: " + str1.delete(15, 22));
//		System.out.println("reverse of string is: " + str1.reverse());
//		StringBuffer sb = new StringBuffer();
//		System.out.println(sb.capacity());
//		System.out.println("Length of string is: " + sb.length());
//		sb.append("DataFlair");
//		System.out.println("Length of string is: " + sb.length());
//		System.out.println(sb.capacity());
//		sb.append("DataFlair is company that teaches programming!!!");
//		System.out.println("Length of string is: " + sb.length());
//		System.out.println(sb.capacity());
//		sb.ensureCapacity(10);
//		System.out.println("Length of string is: " + sb.length());
//		System.out.println(sb.capacity());
//		sb.ensureCapacity(50);
//		System.out.println("Length of string is: " + sb.length());
//		System.out.println(sb.capacity());

		StringBuffer str = new StringBuffer("");
		String originalStr = str.toString();
		System.out.println("reverse of string is: " + str.reverse());
		if (originalStr.equals(str.toString())) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");

		}

	}

}

