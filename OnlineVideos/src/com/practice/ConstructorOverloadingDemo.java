/*
 * Constructor overloading 
 */

package com.practice;

class ConstructorOverloading {

	int i;
	float f;

	public ConstructorOverloading() {
		i = 4;
		f = 2;
		System.out.println("Calling Default constructor.. " + i + " & " + f);
	}

	public ConstructorOverloading(String value) {
		System.out.println("Calling parameterized constructor.. " + value);
	}

	public ConstructorOverloading(int a, double b, String c) {
		System.out.println("Value of a, b & c is: " + a + ", " + b + ", " + c);
	}
}

public class ConstructorOverloadingDemo {
	public static void main(String[] args) {

		ConstructorOverloading cv = new ConstructorOverloading(); // This will call the default constructor
		// ConstructorOverloading()
		ConstructorOverloading cv1 = new ConstructorOverloading("ABCD"); // This will call the parameterized constructor
		// ConstructorOverloading(String)
		ConstructorOverloading cv2 = new ConstructorOverloading(5, 9, "EXAMPLE"); // This will call the parameterized
		// constructor ConstructorOverloading(int,double,String)
	}
}

//OUTPUT
// Calling Default constructor.. 4 & 2.0
// Calling parameterized constructor.. ABCD
// Value of a, b & c is: 5, 9.0, EXAMPLE