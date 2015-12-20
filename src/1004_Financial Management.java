import java.util.*;
import java.util.Map.Entry;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double sum = 0.0;
		for (int i = 0; i < 12; i ++) {
			sum += in.nextDouble();
		}
		System.out.println(roundUp(sum / 12));
	}
	
	public static String roundUp(double value) {
		int num = (int)value;
		double left = value - num;
		int remain = (int)(left * 1000);
		if ((remain) % 10 >= 5) {
			remain += 10;
		}
		remain /= 10;
		if (remain == 100) {
			num ++;
			remain = 0;
		}
		StringBuffer sb = new StringBuffer();
		sb.append("$");
		sb.append(num);
		sb.append(".");
		if (remain < 10) {
			sb.append("0");
		}
		sb.append(remain);
		return sb.toString();
	}
}
