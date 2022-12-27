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
	}
}

//Integer 1: 5
//Integer 2: 6