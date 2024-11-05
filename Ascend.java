// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);

		int a = (int)(Math.random() * lim);
		int b = (int)(Math.random() * lim);
		int c = (int)(Math.random() * lim);

		System.out.println(a + " " + b + " " + c);
		
		int max = (int)(Math.max(a, b));
		int mid = 0;
		int min = (int)(Math.min(a, b));

		if (Math.max(c, max) == c){
			mid = max;
			max = c;	
		}

		else if (Math.min(c, min) == c){
			mid = min;
			min = c;
		}

		else {
			mid = c;
		}

		System.out.println(min + " " + mid + " " + max);
		
		}
	}
