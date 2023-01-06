package com.practice;

class DefaultConstructor {

	int i;
	float f;

	public DefaultConstructor() {
		i = 5;
		f = 4;
		System.out.println("Hi...Value of i and f is: " + i + " & " + f);
	}
}

public class DefaultConstructorDemo {

	public static void main(String[] args) {
		// new DefaultConstructor() will create the object and calls the default
		// constructor
		DefaultConstructor dc = new DefaultConstructor();
	}
}

//OUTPUT
//Hi...Value of i and f is: 5 & 4.0
