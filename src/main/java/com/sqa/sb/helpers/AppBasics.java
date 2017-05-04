package com.sqa.sb.helpers;

import java.util.*;

public class AppBasics {

	static Scanner scanner = new Scanner(System.in);

	public static void farewellUser(String name) {
		System.out.println("Thank you using our app " + name);
	}

	public static String greetUser(String appName) {
		// String name;
		System.out.println("Welcome to the " + appName);
		System.out.println("Could I get your name: ");
		// name = scanner.nextLine();
		return scanner.nextLine();
	}

	public static boolean requestBoolean(String question) {
		System.out.println(question + "true/false");
		String input = scanner.nextLine();
		boolean value = Boolean.parseBoolean(input);
		return value;
	}

	public static char requestChar(String question) {
		System.out.println(question);
		String input = scanner.nextLine();
		char character = input.charAt(0);
		return character;
	}

	public static float requestFloat(String question) {
		System.out.println(question);
		String input = scanner.nextLine();
		float value = Float.parseFloat(input);
		return value;
	}

	/**
	 * @param string
	 * @return
	 */
	public static int requestInt(String question) {
		// TODO Auto-generated method stub
		System.out.println(question);
		String input = scanner.nextLine();
		int value = Integer.parseInt(input);
		return value;
	}

	public static long requestLong(String question) {
		System.out.println(question);
		String input = scanner.nextLine();
		long value = Long.parseLong(input);
		return value;
	}

	public static short requestShort(String question) {
		System.out.println(question);
		String input = scanner.nextLine();
		short value = Short.parseShort(input);
		return value;
	}

	public static String requestString(String question) {
		System.out.println(question);
		String input = scanner.nextLine();
		// int value = Integer.parseInt(input);
		return input;
	}
}
