import java.util.*;
import java.util.Map.Entry;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i ++) {
			double x = in.nextDouble(), y = in.nextDouble();
			int index = i + 1;
			System.out.println("Property " + index + ": This property will begin eroding in year " + getYear(x * x + y * y) + ".");
		}
		System.out.println("END OF OUTPUT.");
	}
	
	public static int getYear(double value) {
		return (int) Math.ceil(value * Math.PI / 2 / 50);
	}
}
