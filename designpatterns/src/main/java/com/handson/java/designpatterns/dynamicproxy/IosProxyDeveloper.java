package com.handson.java.designpatterns.dynamicproxy;

public class IosProxyDeveloper implements Developer {

	Developer developer;

	IosProxyDeveloper(Developer developer) {
		this.developer = developer;
	}

	public void writeCode() {
		System.out.println("In IosProxyDeveloper...");
		developer.writeCode();
	}
}
