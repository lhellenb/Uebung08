package h1;

public class H1_main {
	public static void main(String[] args) {
		Bruch a = new Bruch(25,15);
		Bruch b = new Bruch(5,3);
		System.out.println(a.zaehler+":"+a.nenner);
		
		System.out.println(a.hasSameValueAs(b));
	}

}
