// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int sum = Integer.parseInt(args[3]);

		double sum1 = (double)sum;
		sum1 = sum1 / 3;
		sum1 = Math.ceil(sum1);
		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + sum1 + " Shekels each");
	    // Replace this comment with the rest of your code   
	}
}
