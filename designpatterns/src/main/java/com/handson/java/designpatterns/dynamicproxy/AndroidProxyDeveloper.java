package com.handson.java.designpatterns.dynamicproxy;

public class AndroidProxyDeveloper implements Developer {

	Developer developer;

	AndroidProxyDeveloper(Developer developer) {
		this.developer = developer;
	}

	public void writeCode() {
		System.out.println("In AndroidProxyDeveloper ....");
		developer.writeCode();
	}

}
