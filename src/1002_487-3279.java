import java.util.*;
import java.util.Map.Entry;
import java.math.*;

public class Main {

	static Map<Character, Integer> map = new HashMap<Character, Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map.put('A', 2);
		map.put('B', 2);
		map.put('C', 2);
		map.put('D', 3);
		map.put('E', 3);
		map.put('F', 3);
		map.put('G', 4);
		map.put('H', 4);
		map.put('I', 4);
		map.put('J', 5);
		map.put('K', 5);
		map.put('L', 5);
		map.put('M', 6);
		map.put('N', 6);
		map.put('O', 6);
		map.put('P', 7);
		map.put('R', 7);
		map.put('S', 7);
		map.put('T', 8);
		map.put('U', 8);
		map.put('V', 8);
		map.put('W', 9);
		map.put('X', 9);
		map.put('Y', 9);
		
		Map<String, Integer> count = new HashMap<String, Integer>();
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.nextLine();
		for (int i = 0; i < N; i ++) {
			String s = parse(in.nextLine());
			Integer num = count.get(s);
			if (num == null) {
				num = 0;
			}
			num ++;
			count.put(s, num);
		}
		
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(count.entrySet());
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
				return e1.getKey().compareTo(e2.getKey());
			}
		});
		
		boolean duplicate = false;
		for (Entry<String, Integer> entry : list) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " " + entry.getValue());
				duplicate = true;
			}
		}
		if (!duplicate) {
			System.out.println("No duplicates.");
		}
	}
	
	public static String parse(String s) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i ++) {
			char cur = s.charAt(i);
			if (cur == '-') {
				continue;
			}
			else  if (Character.isDigit(cur)) {
				sb.append(cur);
			}
			else {
				Integer result = map.get(cur);
				if (result != null) {
					sb.append(map.get(cur));
				}
			}
		}
		sb.insert(3, '-');
		return sb.toString();
	}
}
