package br.com.app.unity_test;

public class E2_twoFer {

	public String twoFerMe(String name) {
		if (name == "" || name == null) {
			name = "you";
		}
		
		return "One for "+ name + ", one for me";
	}
	
	public String twoFerOthers(String name, String nameSecond) {
		if (name == "" || name == null) {
			name = "you";
		}
		
		if (nameSecond == "" || nameSecond == null) {
			nameSecond = "you";
		}
		
		return "One for "+ name + ", one for " + nameSecond;
	}
}