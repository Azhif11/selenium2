package org.lang;

public class StateDetails {
	private void SouthIndia() {
		System.out.println("Tamil Language");
		
}
	private void NorthIndia() {
		System.out.println("Hindi Language");

	}
	public static void main(String[] args) {
		LanguageInfo l=new LanguageInfo();
		StateDetails s=new StateDetails();
		l.TamilLanguage();
		l.HindiLanguage();
		s.SouthIndia();
		s.NorthIndia();
		
		
	}

}
