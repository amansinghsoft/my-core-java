package fundamentals;

public class FundamentalsArray_VariableAssignment03_09 {

	public static void main(String[] args) {
		String[] argh = { "A", "B", "C", "D" };
		args = argh;
		for (String s : args) {
			System.out.print(s + "\t");
		}

	}

}
