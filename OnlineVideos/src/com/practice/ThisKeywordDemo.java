/*
 * this represents the current object
 */

package com.practice;

class Calc1 {

	// instance varibles and instance scope
	int num1;
	int num2;

	public Calc1(int number1, int number2) {
		// number1 and number2 is local variables and local scope
		// num1 and num2 is in blue color, because it is used by the object and it
		// belongs to object
		// where as number1 and number2 is in brown color, and it is having local scope
		num1 = number1; // output 4  OR this.num1=number1;
		num2 = number2; // output 5  OR this.num2=number2;
		//It is not compulsory to use this keyword, when you have different variable names, but instance variable 
		// and local variable name is same, we have to use this keyword.
		// this keyword refers to current object/instance eg: this.num1=num1;
	}

	/*public Calc1(int num1, int num2) {
		num1 = num1; // Output is 0
		num2 = num2; // Output is 0 // Because num1 assigns value to itself i.e, num1 similarly
	 * num2 assigns value to itself, so num1 and num2 both values are 0 // local
	 * variable always shadows the instance variables }
	 */
}

public class ThisKeywordDemo {
	public static void main(String[] args) {

		Calc1 obj = new Calc1(4, 5);
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}
}


// OUTPUT
// 4
// 5