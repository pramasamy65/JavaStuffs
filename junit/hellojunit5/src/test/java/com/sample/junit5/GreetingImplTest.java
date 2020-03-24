package com.sample.junit5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GreetingImplTest {

	private Greeting greeting;

	@BeforeEach
	public void setup() {
		System.out.println("@BeforeEach -- Setup");
		greeting = new GreetingImpl();

	}

	@Test
	public void greetShouldRetunAValidOutput() {
		System.out.println("Test Case 1 - greetShouldRetunAValidOutput");
		String result = greeting.greet("Junit");
		Assertions.assertNotNull(result);
		Assertions.assertEquals("Hello Junit", result);
	}

	@Test
	public void greetShouldThrowAnException_For_NameIsNull() {
		System.out.println("Test Case 2 - greetShouldThrowAnException_For_NameIsNull");

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			greeting.greet(null);
		});
	}

	@Test
	public void greetShouldThrowAnException_For_NameIsBlank() {
		System.out.println("Test Case 3 - greetShouldThrowAnException_For_NameIsBlank");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			greeting.greet("");
		});
	}

	@AfterEach
	public void teardown() {
		System.out.println("@AfterEach -- teardown");
		greeting = null;
	}

}
