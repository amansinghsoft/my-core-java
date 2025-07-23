package fundamentals;

public class FundamentalsCommand_LineArgument_01_23 {

	public static void main(String[] args) {
		String[] argh = { "A", "B", "C", "D" };
		args = argh;
		for (String s : args) {
			System.out.print(s + "\t");
		}

	}

}
