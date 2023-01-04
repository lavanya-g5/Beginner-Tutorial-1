/*
 * Continue statement skips the specific iteration and continue executing the remaining statements
 */

package com.practice;

public class ContinueStatementDemo {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("Before continue statement: " + i);
		}
		
		System.out.println("----------USING CONTINUE---------");
		System.out.println("----Skips the 7th iteration & continues with next iteration---");

		for (int i = 1; i <= 10; i++) {
			if (i == 7) { // If the value is 7, I dont want to print 7, in this condition as soon as i
				// becomes 7, it will skip that iteration
				// If we want to skip the iteration we can use continue statement
				continue;
			}
			System.out.println("Value is :" + i);
		}
	}
}


/*
Before continue statement: 1
Before continue statement: 2
Before continue statement: 3
Before continue statement: 4
Before continue statement: 5
Before continue statement: 6
Before continue statement: 7
Before continue statement: 8
Before continue statement: 9
Before continue statement: 10
----------USING CONTINUE---------
----Skips the 7th iteration & continues with next iteration---
Value is :1
Value is :2
Value is :3
Value is :4
Value is :5
Value is :6
Value is :8
Value is :9
Value is :10
*/
