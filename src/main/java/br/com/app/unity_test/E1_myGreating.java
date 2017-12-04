package br.com.app.unity_test;

public class E1_myGreating {
	public String sayHello(String name) {
		if (name == null) {
			name = "to you";
		}
		return "Hello World, hello " + name;
	}
}