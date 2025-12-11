package p2;

public class P2_main {
	public static void main(String[] args) {
		System.out.println(shortenToLowerCase("RindfLeischetikETTierung",13));
		
	}
	
	public static String shortenToLowerCase(String input, int shortenBy) {
		int l=input.length();
		String s=input.substring(0,l-shortenBy);
		String d= s.toLowerCase();
		return d;
			
	}

}
