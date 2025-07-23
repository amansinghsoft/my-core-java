package fundamentals;

public class FundamentalsVar_Arg_02_17 {

	public static void main(String[] args) {
		sum();
		sum(10,20);
		sum(10,20,30);

	}
	
	public static void sum(int... x) {
		int total =0;
		for(int x1:x) {
			total=+x1;
		}
		System.out.println("The sum : "+total);
	}

}
