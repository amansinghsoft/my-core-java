package fundamentals;

public class FundamentalsVariablesStatic_03_12 {

	static int x = 20;

	public static void main(String[] args) {
		FundamentalsVariablesStatic_03_12 obj = new FundamentalsVariablesStatic_03_12();

		System.out.println(obj.x);
		System.out.println(FundamentalsVariablesStatic_03_12.x);
//		Second SOP is recommended to use
		System.out.println(x);

	}

}
