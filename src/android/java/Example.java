package android.java;

public class Example {
	String str = new String("good");
	char[] ch = { 'a', 'b', 'c' };

	public static void main(String args[]) {
		Example ex = new Example();
		ex.change(ex);
		System.out.print(ex.str + " and ");
		System.out.print(ex.ch);
	}

	public void change(Example ex) {
		ex.str = "test ok";
		// this.str = "test ok";
		ex.ch[0] = 'g';
	}
}