package fundamentals;

public class FundamentalsVariablesStatic_04_13 {

	static int x = 25;

	public static void main(String[] args) {
		
		FundamentalsVariablesStatic_04_13 obj = new FundamentalsVariablesStatic_04_13();
		
		System.out.println(x);
		obj.m1();

	}

	public void m1() {
		System.out.println(x);
	}
}
