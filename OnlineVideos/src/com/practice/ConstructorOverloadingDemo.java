/*
 * Constructor overloading 
 * We can have multiple constructor, but make sure that every constructor have different signature(parameters)
 */

package com.practice;

class ConstructorOverloading {

	int i;
	float f;

	// Constructor is called, when object is created
	public ConstructorOverloading() { // without parameter
		i = 4;
		f = 2;
		System.out.println("Calling Default constructor.. " + i + " & " + f);
	}

	public ConstructorOverloading(String value) { // with single parameter
		System.out.println("Calling parameterized constructor.. " + value);
	}

	public ConstructorOverloading(int a, double b, String c) { // with 3 paramters
		System.out.println("Value of a, b & c is: " + a + ", " + b + ", " + c);
	}
}

public class ConstructorOverloadingDemo {
	public static void main(String[] args) {

		ConstructorOverloading cv = new ConstructorOverloading(); // This will call the default constructor
		// ConstructorOverloading()

//		While creating the object,if you pass a value, it will call that particular
		// constructor which takes string value
		ConstructorOverloading cv1 = new ConstructorOverloading("ABCD"); // This will call the parameterized constructor
		// ConstructorOverloading(String)

//		While creating the object,if you pass a value, it will call that particular constructor which takes int,double and String value
		ConstructorOverloading cv2 = new ConstructorOverloading(5, 9, "EXAMPLE"); // This will call the parameterized
		// constructor ConstructorOverloading(int,double,String)
	}
}

//OUTPUT
// Calling Default constructor.. 4 & 2.0
// Calling parameterized constructor.. ABCD
// Value of a, b & c is: 5, 9.0, EXAMPLE