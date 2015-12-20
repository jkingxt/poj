import java.util.*;
import java.util.Map.Entry;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double value = in.nextDouble();
		while (value != 0.0) {
			System.out.println(getCards(value) + " " + "card(s)");
			value = in.nextDouble();
		}
	}
	
	public static int getCards(double value) {
		int count = 0;
		double sum = 0.0;
		while (sum < value) {
			count ++;
			sum += 1.0/(count + 1);
		}
		return count;
	}
}
