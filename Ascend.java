// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);

		int a = (int)((Math.random() * lim)+ 1);
		int b = (int)((Math.random() * lim)+ 1);
		int c = (int)((Math.random() * lim)+ 1);

		System.out.println(a + " " + b + " " + c);
		int max1 = Math.max(a, b);
		int max = Math.max(max1, c); //the biggest

		int min1 = Math.min(a, c);
		int min = Math.min(min1, b); //the smallest

		int mid = (a + b + c) - (max + min);

		System.out.println(min + " " + mid + " " + max);
		
		}
	}
