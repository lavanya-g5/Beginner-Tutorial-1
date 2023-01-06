/*
 * The way we can do Method overloading, same way we can achieve constructor overloading!
 */

package com.practice;

class Casio1 {
	int num1;
	int num2;
	String operation;

	public Casio1() {
		num1 = 0;
		num2 = 0;
		operation = "Nothing";
		System.out.println("Constructor 1 is called...");
	}

	public Casio1(int i) {
		num1 = i;
		num2 = 0;
		operation = "Nothing";
		System.out.println("Constructor 2 is called...");
	}

	public Casio1(int i, int j) {
		num1 = i;
		num2 = j;
		operation = "Nothing";
		System.out.println("Constructor 3 is called...");
	}

	public Casio1(int i, int j, String op) {
		num1 = i;
		num2 = j;
		operation = op;
		System.out.println("Constructor 4 is called...");
	}
}

public class ConstructorOverloadingDemo1 {
	public static void main(String[] args) {
		Casio1 obj = new Casio1(); // Calls Constructor 1
		Casio1 obj1 = new Casio1(1); // Calls Constructor 2
		Casio1 obj2 = new Casio1(2, 3); // Calls Constructor 3
		Casio1 obj3 = new Casio1(4, 5, "ADD"); // Calls Constructor 4
	}
}

// OUTPUT
// Constructor 1 is called...
// Constructor 2 is called...
// Constructor 3 is called...
// Constructor 4 is called...
