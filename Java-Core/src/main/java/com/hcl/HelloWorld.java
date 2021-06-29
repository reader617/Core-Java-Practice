package com.hcl;

import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {
		// Basic Practice
		// Exercise #2
		// System.out.println("Hello World!");

		// Conditional Practice
		/*
		 * boolean result = 8 > 11; if (result) { System.out.println("Result: " +
		 * result); }
		 * 
		 * System.out.println("end");
		 * 
		 * int num = 5;
		 * 
		 * switch(num) { case 4: System.out.println("It is 4"); break; case 5:
		 * System.out.println("It is 5"); break; default:
		 * System.out.println("Default value"); }
		 */

		// Exercise #3
		/*
		 * int num1 = 5; char char1 = 'G'; double d1 = 3.4; byte b1 = 6; float f1 =
		 * 2.3F; String name = "Genevieve";
		 * 
		 * System.out.println("Int " + num1); System.out.println("Char " + char1);
		 * System.out.println("Double " + d1); System.out.println("Byte " + b1);
		 * System.out.println("Float " + f1); System.out.println("String " + name);
		 */

		// Exercise #5
		/*
		 * for (int i = 1; i <= 10; i++) { System.out.println(i); }
		 */

		// Exercise 6
		/*
		 * int sum = 0; for (int i = 1; i <= 10; i++) { sum+=i; }
		 * System.out.println("Sum: " + sum);
		 */

		// Exercise #7
		/*
		 * int age = 0; outer: while (age <= 21) { age++;
		 * 
		 * if (age == 16) { System.out.println("Get your driver's license!"); continue
		 * outer; } else { System.out.println("Another year."); } }
		 */

		// Exercise #8
		/*
		 * char G = 'G';
		 * 
		 * switch(G) { case 'A': System.out.println("First letter"); break; case 'B':
		 * System.out.println("Second letter"); break; case 'C':
		 * System.out.println("Third letter"); break; case 'D':
		 * System.out.println("Fourth letter"); break; case 'E':
		 * System.out.println("Fifth letter"); break; case 'F':
		 * System.out.println("Sixth letter"); break; case 'G':
		 * System.out.println("Seventh letter"); break; case 'H':
		 * System.out.println("Eighth letter"); break; default:
		 * System.out.println("Not a capital letter"); break; }
		 */

		// Exercise #9
		/*
		 * Integer temp; int sum = 0; for (int i = 0; i < args.length; i++) {
		 * System.out.println(args[i]);
		 * 
		 * temp = Integer.parseInt(args[i]); sum += temp; }
		 * 
		 * System.out.println("Sum " + sum);
		 */

		// Exercise #10
		/*
		 * int calc1; int calc2; int calc3; int calc4;
		 * 
		 * calc1 = -5 + 8 * 6; calc2 = (55+9) % 9; calc3 = 20 + -3*5 / 8; calc4 = 5 + 15
		 * / 3 * 2 - 8 % 3;
		 * 
		 * System.out.println("1: 43 " + calc1); System.out.println("1: 1 " + calc2);
		 * System.out.println("1: 19 " + calc3); System.out.println("1: 13 " + calc4);
		 */

		// Exercise #11
		/*
		 * int num1 = 20; int num2 = 4; int sum; int dif; int mult; int div; int rem;
		 * 
		 * sum = num1 + num2; dif = num1 - num2; mult = num1 * num2; div = num1 / num2;
		 * rem = num1 % num2;
		 * 
		 * System.out.println("Sum " + sum); System.out.println("Difference " + dif);
		 * System.out.println("Multiply " + mult); System.out.println("Divide " + div);
		 * System.out.println("Remainder " + rem);
		 */

		// Exercise #11 (2nd 11)
		/*
		 * Scanner input = new Scanner(System.in); int i1, i2, i3; double avg;
		 * System.out.println("Enter the first number: "); i1 = input.nextInt();
		 * System.out.println("Enter the second number: "); i2 = input.nextInt();
		 * System.out.println("Enter the third number: "); i3 = input.nextInt();
		 * 
		 * avg = (i1 + i2 + i3) / 3.0;
		 * 
		 * System.out.println("The average is: " + avg); input.close();
		 */

		// Exercise #12
		/*
		 * int num1 = 5; int num2 = 7; int temp; temp = num1; num1 = num2; num2 = temp;
		 */

		// Exercise #13
		/*
		 * int test; boolean prime; Scanner input = new Scanner(System.in);
		 * System.out.println("Enter a nubmer to check if it is prime: "); test =
		 * input.nextInt(); prime = isPrime(test);
		 * 
		 * if (prime) System.out.println("The number is prime!"); else
		 * System.out.println("The number is not prime!");
		 * 
		 * input.close();
		 */

		// Exercise #14
		// System.out.println("The value of G is " + (int) 'G');

		// Exercise #15
		/*
		 * for (int i = 1; i <= 100; i++) { if (i % 3 == 0 && i % 5 == 0)
		 * System.out.println("Fizz Buzz"); else { if (i % 3 == 0)
		 * System.out.println("Fizz"); if (i % 5 == 0) System.out.println("Buzz"); } }
		 */

		// Exercise #16
		/*
		 * Scanner input = new Scanner(System.in); int num, res;
		 * System.out.println("Enter a positive integer "); num = input.nextInt(); res =
		 * checkSum(num);
		 * 
		 * switch(res) { case 1: System.out.println("The sum of the digits is odd");
		 * break; case -1: System.out.println("The sum of the digits is even "); break;
		 * case 0: System.out.println("The input is invalid"); break; default:
		 * System.out.println("Something went wrong!"); }
		 * 
		 * input.close();
		 */

		// Exercise #17
		/*
		 * Scanner input = new Scanner(System.in); int num, res;
		 * System.out.println("Enter a positive integer "); num = input.nextInt(); res =
		 * sumOfSquaresOfEvenDigits(num);
		 * 
		 * System.out.println("The sum of the squares of the even digits is: " + res);
		 * input.close();
		 */

		// Exercise #18
		String sentence, word;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		sentence = input.nextLine();

		word = getLongestWord(sentence);
		System.out.println("The longest word is: " + word);

		input.close();
	}

	// function for exercise #13
	/*
	 * public static boolean isPrime(int num) { if (num <= 1) {
	 * System.out.println("Invalid input"); return false; }
	 * 
	 * //Edge condition could be better, it's something like the // square root of
	 * num? But it would still be linear. for (int i = 2; i < num / 2; i++) { if
	 * (num % i == 0) return false; }
	 * 
	 * return true; }
	 */

	// Function for exercise #16
	/*
	 * public static int checkSum(int num) { if (num < 0) return 0; // For the
	 * purposes of this assignment 0 is even (could also be made invalid) if (num ==
	 * 0) return -1; if (num == 1) return 1;
	 * 
	 * int sum = 0; int temp; int counter = num;
	 * 
	 * while (counter > 1) { temp = counter % 10; sum += temp; counter = counter /
	 * 10; }
	 * 
	 * if (sum % 2 == 0) return -1; else return 1; }
	 */

	// Function for exercise #17
	/*
	 * public static int sumOfSquaresOfEvenDigits(int num) { if (num <= 0) return 0;
	 * if (num == 1) return 0;
	 * 
	 * int sum = 0; int temp; int counter = num;
	 * 
	 * while (counter > 1) { counter = counter / 10; temp = counter % 10; sum +=
	 * temp * temp; counter = counter / 10; }
	 * 
	 * return sum; }
	 */

	// Function for exercise #18
	public static String getLongestWord(String sentence) {
		String lw = "";
		int wordLength;
		int gWordLength = 0;
		int index = 0;
		int temp;
		boolean end = true;

		while (end) {
			temp = sentence.indexOf(' ', index);
			if (temp == -1) {
				end = false;
				wordLength = sentence.length() - index;
				if (wordLength > gWordLength) {
					gWordLength = wordLength;
					lw = sentence.substring(index);
				}
			} else {
				wordLength = temp - index;

				if (wordLength > gWordLength) {
					gWordLength = wordLength;
					lw = sentence.substring(index, temp);
				}
				index = temp + 1;
			}
		}

		return lw;
	}
}
