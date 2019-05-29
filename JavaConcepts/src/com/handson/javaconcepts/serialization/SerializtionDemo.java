package com.handson.javaconcepts.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializtionDemo {

	public static void main(String args[]) throws IOException {

		Employee employee = new Employee();
		employee.setEmployeeId(1);
		employee.setEmployeeName("Prakash");
		employee.setDepartmentName("Machines");

		FileOutputStream fos = new FileOutputStream("seralize.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(employee);

	}
}
