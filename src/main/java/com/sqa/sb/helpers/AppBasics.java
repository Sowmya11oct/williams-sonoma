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
}
