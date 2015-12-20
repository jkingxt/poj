import java.util.*;
import java.util.Map.Entry;
import java.math.*;

public class Main {
	static class Group{
		public String s;
		public int count;
		public int index;
		public Group(String s, int count, int index) {
			this.s = s;
			this.count = count;
			this.index = index;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt();
		in.nextLine();
		List<Group> list = new LinkedList<Group>();
		for (int i = 0; i < m; i ++) {
			String s = in.nextLine();
			list.add(new Group(s, unsortedness(s.toCharArray(), 0, n - 1), i));
		}
		Collections.sort(list, new Comparator<Group>(){
			public int compare(Group g1, Group g2) {
				if (g1.count != g2.count) {
					return g1.count - g2.count;
				}
				else {
					return g1.index - g2.index;
				}
			}
		});
		for (int i = 0; i < m; i ++) {
			System.out.println(list.get(i).s);
		}
	}
	
	public static int unsortedness(char[] array, int start, int end) {
		if (start >= end) {
			return 0;
		}
		
		int mid = start + (end - start) / 2;
		int sum = 0;
		sum += unsortedness(array, start, mid);
		sum += unsortedness(array, mid + 1, end);
		sum += merge(array, start, mid, end);
		
		return sum;
	}
	
	public static int merge(char[] array, int start, int mid, int end) {
		char[] temp = new char[end - start + 1];
		int i = start, j = mid + 1, count = 0, k = 0;
		while (i <= mid && j <= end) {
			if (array[i] <= array[j]) {
				temp[k] = array[i];
				i ++;
			}
			else {
				count += mid - i + 1;
				temp[k] = array[j];
				j ++;
			}
			k ++;
		}
		while (i <= mid) {
			temp[k] = array[i];
			i ++;
			k ++;
		}
		while (j <= end) {
			temp[k] = array[j];
			j ++;
			k ++;
		}
		for (int m = 0; m < end - start + 1; m ++) {
			array[start + m] = temp[m];
		}
		
		return count;
	}
}
