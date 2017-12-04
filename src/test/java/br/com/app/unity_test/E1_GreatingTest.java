package br.com.app.unity_test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class E1_GreatingTest {

	E1_myGreating greating = new E1_myGreating();

	@Test
	public void correctGreatingHelloWorld() {
		String name = "Paulo";
		String expectedGreating = "Hello World, hello " + name;

		String returnedGreating = greating.sayHello(name);

		assertEquals(expectedGreating, returnedGreating);
	}

	@Test
	public void nullGreatingHelloWorld() {
		String expectedGreating = "Hello World, hello to you";

		String returnedGreating = greating.sayHello(null);

		assertEquals(expectedGreating, returnedGreating);
	}
}
