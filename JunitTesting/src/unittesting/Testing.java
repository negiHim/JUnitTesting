package unittesting;

import org.junit.Test;

public class Testing {
	
//method to checking that the full name of employee fromatting is good or not
	// correct format :-- 
	 // 1. every letter after space should be capiital letter
	@Test
	public static boolean checkFormatOfName(String fullName) {
		
		//if null comes
		if(fullName.equals(null)) return false;
		
		String name[] = fullName.split(" ");
		
		for(int i=0;i<name.length;i++) {
		   int firstCharOfEachWord = name[i].charAt(0);
		   if(65>firstCharOfEachWord || 90<firstCharOfEachWord) {
			   return false;
		   }
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(checkFormatOfName(null));
		
	}
}
