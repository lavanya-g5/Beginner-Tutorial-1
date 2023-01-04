/*
 * ARITHMETIC OPERATOR: (+, -, *, /, %)
 * BITWISE OPERATOR: (<<, >>)
 * RELATIONAL OPERATOR: (<, >, <<, >>, !=)
 * LOGICAL OPERATOR
 */

package com.practice;

public class ArithmeticOperator {

	public static void main(String[] args) {

		int m = 6, n = 2;
		int result1 = m + n; // Expected - 8
		System.out.println("Addition of m and n is: " + result1);
		System.out.println("----------------------------------");
		int result2 = m - n; // Expected - 4
		System.out.println("Subtraction of m and n is: " + result2);
		System.out.println("----------------------------------");
		int result3 = m * n; // Expected - 12
		System.out.println("Multiplication of m and n is: " + result3);
		System.out.println("----------------------------------");
		int result4 = m / n; // Expected - 3
		System.out.println("Division of m and n is: " + result4);
		System.out.println("Division operator gives quotient as result: " + result4);

		int x = 6, y = 4;

		int result5 = x / y; // Expected - 1.5 but getting is 1, bcz
		// division operator will always gives you the quotient, it will not give you
		// the decimal values it will give you only quotient part, how do you get the
		// decimal part,first we are using int here i.e int x=6, y=4; what we can do is
		// change data type to double
		System.out.println(
				"Division of x and y that is 6 & 4 is: " + result5 + " (here decimal part is chopping off...)");

		// After changing data type to double
		double decimalPart1 = x / y;
		System.out
				.println("Changing data type from int to double to get the decimal part of Division: " + decimalPart1);
		// But still we are not getting 1.5, instead getting 1.0,
		// but we should get 1.5, thing is m/n is giving us 1.0, lets cast it to double
		// we will get 1.5 as expected

		double decimalPart2 = (double) x / y;
		System.out.println("Upcasting int to double to get decimal part & output 1.5 as expected: " + decimalPart2);

		System.out.println("----------------------------------");

		int result6 = m % n; // Expected - 0
		System.out.println("Modulus of m and n is: " + result6);
		System.out.println("Modulus operator gives remainder as result: " + result6);

		int a = 8, b = 3;  // Expected is 2
		int result7 = a % b;
		System.out.println("Modulus of a & b is: " + result7);
	}
}

/*OUTPUT
Addition of m and n is: 8
----------------------------------
Subtraction of m and n is: 4
----------------------------------
Multiplication of m and n is: 12
----------------------------------
Division of m and n is: 3
Division operator gives quotient as result: 3
Division of x and y that is 6 & 4 is: 1 (here decimal part is chopping off...)
Changing data type from int to double to get the decimal part of Division: 1.0
Upcasting int to double to get decimal part & output 1.5 as expected: 1.5
----------------------------------
Modulus of m and n is: 0
Modulus operator gives remainder as result: 0
Modulus of a & b is: 2
*/
