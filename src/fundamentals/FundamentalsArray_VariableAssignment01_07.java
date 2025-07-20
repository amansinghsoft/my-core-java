package fundamentals;

public class FundamentalsArray_VariableAssignment01_07 {

	public static void main(String[] args) {
		int[] x = { 10, 20, 30, 40, 50 };
		char[] ch = { 'a', 'b', 'c', 'd', 'd' };

		for (int x1 : x) {
			System.out.print(x1 + "\t");
		}

		System.out.println();

		for (char x1 : ch) {
			System.out.print(x1 + "\t");
		}
	}

}
