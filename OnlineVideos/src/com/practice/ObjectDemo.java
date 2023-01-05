package com.practice;

class Calc {

	int num1;
	int num2;
	int result;

	public void perform() {
		result = num1 + num2;
	}

}

public class ObjectDemo {

	public static void main(String[] args) {
		Calc obj = new Calc(); // Object is created & obj is reference
		// when you create an object it will load lots of things to memory, eg.
		// variables, methods
		// Object knows something(variables) & does something(method)
		// How to access variables & ,methods from class Calc
		obj.num1 = 3;
		obj.num2 = 5;
		System.out.println("Before calling the perform method: " + obj.result);
		// It will give you result as 0, because we have not assigned value to result variable
		obj.perform(); 
		// it will call the method, perform and adds num1 & num2 and assigns the result
		// to variable result
		System.out.println("After calling the perform method: " + obj.result);
	}
}

//OUTPUT
/*
Before calling the perform method: 0
After calling the perform method: 8
*/