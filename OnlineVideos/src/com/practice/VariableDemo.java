// Variable - To store the data we use variables, values are allowed to change(Once you define the 
// variable you can change the value later also that is called Variable.
// int i =5; initialization & declaration
// here int -> data type, i -> variable name, 5 -> value
// Allowed special character is $ and _ i.e underscore
// First character should not start with numbers, you can start with characters,$ and _
// byte - 1 byte - 8 bits
// short - 2 bytes - 16 bits
// int - 4 bytes - 32 bits
// long - 8 bytes - 64 bits
// boolean - true/false 
// char - 2 bytes - 16 bits
// float - 4 bytes - 32 bits
// double - 8 bytes - 64 bits

package com.practice;

public class VariableDemo {

	public static void main(String[] args) {

		int i = 5;
		System.out.println("Integer 1: " + i);

		// Assigning new value to variable i
		i = 6;
		System.out.println("Integer 2: " + i);

		float percent1 = 5.5f; // float data type should have f followed by value
		System.out.println("Float value: " + percent1);

		double percent2 = 5.5;
		System.out.println("Double value: " + percent2);

		long longValue = 500l; // long data type should have l followed by value (specify the number and l)
		System.out.println("Long Value: " + longValue);

		char c = 'A';
		System.out.println("Character value 1: " + c);

		c = 66; // 66 is ASCII value for character B (American standard code for information
				// interchange
		System.out.println("Character value changes: " + c);

		double doubleValue1 = 5; // 5 is int value , but double can hold, bcz it is implicit conversion or
									// UP CASTING (lower data type to higher data type)
		System.out.println("Double value: " + doubleValue1);

		// int intValue = 5.6; --> Compilation error, bcz higher data type to lower data
		// type definition is not supported
		int intValue = (int) 5.6; // This is DOWN CASTING
		System.out.println("Integer value: " + intValue);

	}
}

//Integer 1: 5
//Integer 2: 6
//Float value: 5.5
//Double value: 5.5
//Long Value: 500
//Character value 1: A
//Character value changes: B
//Double value: 5.0
//Integer value: 5

// CONVERSION CHAIN

//BYTE -> SHORT -> INT -> LONG -> FLOAT-> DOUBLE
//CHAR -> INT -> LONG -> FLOAT-> DOUBLE