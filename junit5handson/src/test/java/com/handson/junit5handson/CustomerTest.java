package com.handson.junit5handson;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.handson.junit5handson.model.Customer;

@TestInstance(Lifecycle.PER_METHOD)
public class CustomerTest {

	@Test
	@DisplayName("Customer has enough points")
	public void setDetails() {
		Customer customer = new Customer();
		customer.setAccountNumber("123456");
		assertEquals("123456", customer.getAccountNumber(), "Vales are unEqual");
		assumeTrue("123456".equals(customer.getAccountNumber()));
		assertEquals("1234567", customer.getAccountNumber(), "Vales are unEqual");
	}

	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All...");
	}

	@AfterEach
	public void afterEach() {
		System.out.println("After each....");
	}

	@Test
	@Disabled
	public void method1() {
		System.out.println("Method 1 ....");
	}
	

	@Nested
	class NestedClass {

		@AfterEach
		public void afterEach() {
			System.out.println("Nested After each....");
		}

		@Test
		public void method1NestedClass() {
			System.out.println("Method 1 NestedClass....");
			assertTimeout(Duration.ofMillis(3), () -> {
				Thread.sleep(2);
			});
		}
	}

}
