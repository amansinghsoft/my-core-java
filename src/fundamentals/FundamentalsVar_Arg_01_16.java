package fundamentals;

public class FundamentalsVar_Arg_01_16 {

	public static void main(String[] args) {
		m1();
		m1(10);
		m1(10, 20);
		m1(10, 20, 30, 40);

	}

	public static void m1(int... x) {
		System.out.println("Var-Arg methods.");
	}

}
