/*
 * Method Overloading -> When multiple methods have same method name but different parameters
 */

package com.practice;

class Casio {

	public void add(int i, int j) {
		System.out.println("Method1: " + (i + j));
	}

	public void add(int i, int j, int k) {
		System.out.println("Method2: " + (i + j + k));
	}

	public void add(double i, double j) {
		System.out.println("Method3: " + (i + j));
	}
}

public class MethodOverloadingDemo {
	public static void main(String[] args) {
		Casio obj = new Casio();
		obj.add(2, 5); // Calls Method1
		obj.add(4, 1, 6); // Calls Method2
		obj.add(2.5, 4.5); // Calls Method3
	}
}

// OUTPUT
// Method1: 7
// Method2: 11
// Method3: 7.0
