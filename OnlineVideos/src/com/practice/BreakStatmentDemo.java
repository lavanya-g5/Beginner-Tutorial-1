/* 
 * If we dont want to execute set of iteration after the condition , we can go with break statement
 */

package com.practice;

public class BreakStatmentDemo {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Before break statement: " + i);
		}

		System.out.println("---------------USING BREAK------------------");
		// Using Break statement
		for (int i = 1; i <= 10; i++) {
			if (i > 5) {
				break; // here when i value becomes greater than 5, stops printing the values, and comes out of the for loop
			}
			System.out.println("Value is: " + i);
		}
	}
}

/* OUTPUT
Before break statement: 1
Before break statement: 2
Before break statement: 3
Before break statement: 4
Before break statement: 5
Before break statement: 6
Before break statement: 7
Before break statement: 8
Before break statement: 9
Before break statement: 10
---------------USING BREAK------------------
Value is: 1
Value is: 2
Value is: 3
Value is: 4
Value is: 5
*/
