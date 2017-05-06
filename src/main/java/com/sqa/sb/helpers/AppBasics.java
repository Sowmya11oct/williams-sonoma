package com.sqa.sb.helpers;

import java.util.*;

import com.sqa.sb.helper.exceptions.*;

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
		System.out.println(question);
		String input = scanner.nextLine();
		int value = Integer.parseInt(input);
		return value;
	}

	/**
	 * @param string
	 * @param j
	 * @param i
	 * @param string
	 * @return
	 */
	public static int requestInt(String question, int min, int max, String errorResponse) {
		// TODO Auto-generated method stub
		String input;
		int value = 0;
		boolean isValid = false;
		while (isValid) {
			System.out.println(question + " ");
			input = scanner.nextLine().trim();
			try {
				value = Integer.parseInt(input);
				if (value < min) {
					throw new UnderMinRangeException();
				} else if (value > max) {
					throw new OverMaxRangeException();
				}
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You have not entered a valid numeric value (" + input + ")");
			} catch (UnderMinRangeException e) {
				System.out.println(errorResponse + "(" + input + ")[Under" + min + "]");
			} catch (OverMaxRangeException e) {
				System.out.println(errorResponse + "(" + input + ")[Over" + max + "]");
			}
		}
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
	/**
	 * @param string
	 * @param i
	 * @param j
	 * @param string2
	 */
}
