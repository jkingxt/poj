import java.util.*;
import java.util.Map.Entry;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 1;
		while (true) {
			int p = in.nextInt(), e = in.nextInt(), i = in.nextInt(), d = in.nextInt();
			if (p == -1) {
				return;
			}
			int next = nextDay(p, e, i);
			next = (next - d + 21252) % 21252;
			if (next == 0) {
				next = 21252;
			}
			System.out.println("Case " + count + ": the next triple peak occurs in " + next + " days.");
			count ++;
		}
	}
	
	public static int nextDay(int p, int e, int i) {
		while (true) {
			if (p == e && e == i) {
				return p;
			}
			int min = p, index = 0;
			if (e < min) {
				min = e;
				index = 1;
			}
			if (i < min) {
				min = i;
				index = 2;
			}
			switch(index) {
			case 0:
				p += 23;
				break;
			case 1:
				e += 28;
				break;
			case 2:
				i += 33;
				break;
			}
		}
	}
}
