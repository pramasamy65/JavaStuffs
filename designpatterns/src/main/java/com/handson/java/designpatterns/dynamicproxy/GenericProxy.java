package com.handson.java.designpatterns.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class GenericProxy implements InvocationHandler {

	Object obj;

	public Object bind(Object obj) {
		this.obj = obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("In Generic Proxy");
		Object res = method.invoke(obj, args);
		return res;
	}

}
