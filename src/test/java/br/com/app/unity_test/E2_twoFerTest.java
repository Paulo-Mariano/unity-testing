package br.com.app.unity_test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class E2_twoFerTest {
	
	private E2_twoFer twoFer;
	
	@Before
	public void setup() {
		twoFer = new E2_twoFer();	
	}
		
	@Test
	public void noNameGivenForYouHPT() {
		//arrange
		String oneForExpected = "One for you, one for me";
		
		//act
		String OneForYouResult = twoFer.twoFerMe("");
		
		//assert
		assertEquals(oneForExpected, OneForYouResult);
	}
	@Test
	public void nullNameGivenForYou() {
		//arrange
		String oneForExpected = "One for you, one for me";
		
		//act
		String OneForYouResult = twoFer.twoFerMe(null);
		
		//assert
		assertEquals(oneForExpected, OneForYouResult);
	}
	
	@Test
	public void OneNameGivenHPT() {
		//arrange
		String name = "Paulo";
		String oneForExpected = "One for " + name +", one for me";
		
		//act
		String OneForYouResult = twoFer.twoFerMe(name);
		
		//assert
		assertEquals(oneForExpected, OneForYouResult);
	}
	
	@Test
	public void noneForMe() {
		//arrange
		String nameFirst = "Andray";
		String nameSecound = "Bety";
		String oneForExpected = "One for " + nameFirst +", one for " + nameSecound;
		
		//act
		String OneForYouResult = twoFer.twoFerOthers(nameFirst, nameSecound);
		
		//assert
		assertEquals(oneForExpected, OneForYouResult);
	}
	
	@Test
	public void noneForMeNoNameFirst() {
		//arrange
		String nameFirst = "";
		String nameSecound = "Bety";
		String oneForExpected = "One for you, one for " + nameSecound;
		
		//act
		String OneForYouResult = twoFer.twoFerOthers(nameFirst, nameSecound);
		
		//assert
		assertEquals(oneForExpected, OneForYouResult);
	}
	
	@Test
	public void noneForMeNoNameSecound() {
		//arrange
		String nameFirst = "Abraye";
		String nameSecound = "";
		String oneForExpected = "One for " + nameFirst +", one for you";
		
		//act
		String OneForYouResult = twoFer.twoFerOthers(nameFirst, nameSecound);
		
		//assert
		assertEquals(oneForExpected, OneForYouResult);
	}
	
	@Test
	public void noneForMeNoNameGiven() {
		//arrange
		String nameFirst = "";
		String nameSecound = "";
		String oneForExpected = "One for you, one for you";
		
		//act
		String OneForYouResult = twoFer.twoFerOthers(nameFirst, nameSecound);
		
		//assert
		assertEquals(oneForExpected, OneForYouResult);
	}
	
	@Test
	public void noneForMeNullNames() {
		//arrange
		String nameFirst = null;
		String nameSecound = null;
		String oneForExpected = "One for you, one for you";
		
		//act
		String OneForYouResult = twoFer.twoFerOthers(nameFirst, nameSecound);
		
		//assert
		assertEquals(oneForExpected, OneForYouResult);
	}
}
