import java.util.*;
import java.util.Map.Entry;
import java.math.*;

public class Main {
	static Map<String, Integer> Haab;
	static Map<Integer, String> Tzolkin;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Haab = new HashMap<String, Integer>();
		Haab.put("pop", 0);
		Haab.put("no", 1);
		Haab.put("zip", 2);
		Haab.put("zotz", 3);
		Haab.put("tzec", 4);
		Haab.put("xul", 5);
		Haab.put("yoxkin", 6);
		Haab.put("mol", 7);
		Haab.put("chen", 8);
		Haab.put("yax", 9);
		Haab.put("zac", 10);
		Haab.put("ceh", 11);
		Haab.put("mac", 12);
		Haab.put("kankin", 13);
		Haab.put("muan", 14);
		Haab.put("pax", 15);
		Haab.put("koyab", 16);
		Haab.put("cumhu", 17);
		Haab.put("uayet", 18);
		
		Tzolkin = new HashMap<Integer, String>();
		Tzolkin.put(0, "imix");
		Tzolkin.put(1, "ik");
		Tzolkin.put(2, "akbal");
		Tzolkin.put(3, "kan");
		Tzolkin.put(4, "chicchan");
		Tzolkin.put(5, "cimi");
		Tzolkin.put(6, "manik");
		Tzolkin.put(7, "lamat");
		Tzolkin.put(8, "muluk");
		Tzolkin.put(9, "ok");
		Tzolkin.put(10, "chuen");
		Tzolkin.put(11, "eb");
		Tzolkin.put(12, "ben");
		Tzolkin.put(13, "ix");
		Tzolkin.put(14, "mem");
		Tzolkin.put(15, "cib");
		Tzolkin.put(16, "caban");
		Tzolkin.put(17, "eznab");
		Tzolkin.put(18, "canac");
		Tzolkin.put(19, "ahau");
		
		int n = in.nextInt();
		in.nextLine();
		System.out.println(n);
		for (int i = 0; i < n; i ++) {
			String a = in.next();
			int day = Integer.parseInt(a.substring(0, a.length() - 1));
			String b = in.next();
			int month = Haab.get(b);
			String c = in.next();
			int year = Integer.parseInt(c);
			int total = 20 * month + day + year * 365;
			
			int ryear = total / 260;
			total -= ryear * 260;
			int rday = total % 13 + 1;
			int rmonth = total % 20;
			System.out.println(rday + " " + Tzolkin.get(rmonth) + " " + ryear);
		}
	}
}
