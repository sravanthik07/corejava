package corejava.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	// Dictionary
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet(new MyComparator());
		t.add("zebra");
		t.add("zoo");
		t.add(new StringBuffer("ball"));
		t.add("bring");
		t.add("tall");
		t.add("triangle");
		t.add("apple");
		t.add("ant");
		System.out.println(t);
		
	}
	
	public static class MyComparator implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			
			String s1 = o1.toString();
			String s2 = o2.toString();
			int l1 = s1.length();
			int l2 = s1.length();
			if(l1 < l2)
				return -1;
			if(l1 > l2)
				return 1;
			else
				return s1.compareTo(s2);
		}
		
	}

}
