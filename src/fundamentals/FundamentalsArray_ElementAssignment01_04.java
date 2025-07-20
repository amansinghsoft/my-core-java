package fundamentals;

public class FundamentalsArray_ElementAssignment01_04 {

	public static void main(String[] args) {
		int[] x = new int[5];
		x[0] = 10;
		x[1] = 'a';
		byte b = 20;
		x[2] = b;
		short s = 30;
		x[3] = s;

		for (int x1 : x) {
			System.out.println(x1);
		}
	}

}
