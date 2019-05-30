package com.handson.java.hacker_earth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem Statement :
 * https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/tutorial/
 * 
 *
 */
public class HotelManagmentUsingStack {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String totalValue = reader.readLine();
		int inputs = Integer.parseInt(totalValue);
		Stack stack = new Stack(inputs);
		for (int index = 0; index < inputs; index++) {
			String selection = reader.readLine();
			if (selection.equals("1") && stack.top == -1) {
				System.out.println("No Food");
			} else if (selection.startsWith("2")) {
				stack.push(selection);
			} else if (selection.equals("1") && stack.top > -1) {
				String deliverd = stack.pop();
				System.out.println(deliverd.split(" ")[1]);
			}
		}
	}
}
/*
 * 6
 * 
 * 1
 * 
 * 2 5
 * 
 * 2 7
 * 
 * 2 9
 * 
 * 1
 * 
 * 1
 */

class Stack {

	String[] stackValues;
	int top = -1;

	Stack(int size) {
		stackValues = new String[size];
	}

	void push(String value) {
		top++;
		stackValues[top] = value;
	}

	String pop() {
		String value = stackValues[top];
		top--;
		return value;
	}

	boolean isEmpty() {
		return top == -1;
	}

	boolean isFull() {
		return stackValues.length == top - 1;
	}

}
