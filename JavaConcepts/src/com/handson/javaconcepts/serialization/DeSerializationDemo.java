package com.handson.javaconcepts.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	public static void main(String args[]) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("seralize.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee employee = (Employee) ois.readObject();
		System.out.println(employee.getEmployeeName());

	}
}
