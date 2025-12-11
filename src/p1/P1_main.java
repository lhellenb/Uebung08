 package p1;

public class P1_main {
	public static void main(String[] args) {
		System.out.println(getNumber(41));
	}
	
	public static int getNumber(int a) {
		int u = (a>42) ? 42:0;
		return u;
	}

}
