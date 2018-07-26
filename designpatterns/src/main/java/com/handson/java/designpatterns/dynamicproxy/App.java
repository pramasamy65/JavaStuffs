package com.handson.java.designpatterns.dynamicproxy;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		System.out.println("..............");

		Developer iosDeveloper = new IosDeveloper();
		Developer androidDevloper = new AndroidDeveloper();
		androidDevloper.writeCode();

		// Using proxy Object which intern calls actual Object
		new AndroidProxyDeveloper(androidDevloper).writeCode();

		System.out.println("......................");

		Developer androidDevloper1 = (Developer) new GenericProxy().bind(androidDevloper);
		androidDevloper1.writeCode();

		System.out.println("......................");

		Developer iosDeveloper1 = (Developer) new GenericProxy().bind(iosDeveloper);
		iosDeveloper1.writeCode();

	}
}
