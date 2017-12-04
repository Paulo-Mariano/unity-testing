package br.com.app.unity_test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class E3_ReverseStringTest {

	private E3_ReverseString reverseString;
	
	@Before
	public void setup() {
		reverseString = new E3_ReverseString();	
	}
	
	@Test
	public void reverseStringHPT () {
		//Arrange
		String wordNormal = "paulo";
		String wordReversed = "oluap";
		
		//Act
		String Result = reverseString.reverse(wordNormal);		
		
		//Assert
		assertEquals(wordReversed,Result);
	}
	@Test
	public void reverseStringWithSpaceHPT () {
		//Arrange
		String wordNormal = "paulo paulo";
		String wordReversed = "oluap oluap";
		
		//Act
		String Result = reverseString.reverse(wordNormal);		
		
		//Assert
		assertEquals(wordReversed,Result);
	}
}
