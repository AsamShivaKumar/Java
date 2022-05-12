package comparableAndComparator;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		List<Student> l = new ArrayList<>();
		l.add(new Student("Shiva", 19));
		l.add(new Student("Kumar", 18));
		l.add(new Student("Asam", 30));
		l.add(new Student("Asam", 18));
		l.add(new Student("Laxman", 16));
		l.add(new Student("Laya", 20));
		l.add(new Student("Kavitha", 18));
//		for(Student s: l) {
//			System.out.println(s.name + " " + s.age);
//		}
//		Collections.sort(l);
		
//		Collections.sort(l, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student a, Student b) {
//				if(a.name.equals(b.name)) {
//					return a.age-b.age;
//				}else {
//					return a.name.compareTo(b.name);
//				}
//			}
//			
//		});
		
		Collections.sort(l, (o1, o2) ->{ 
		if(o1.name.equals(o2.name)) {
			return o1.age-o2.age;
		}else{
			return o1.name.compareTo(o2.name);
		}});
		for(Student s: l) {
			System.out.println(s.name + " " + s.age);
		}
		
		
		// The list can be sorted directly when the Student class implements Comparable interface
//		Collections.sort(l);
//		for(Student s: l) {
//			System.out.println(s.name + " " + s.age);
//		}
		
	}

	public class SortByAgeThenName implements Comparator<Student>{
		@Override
		public int compare(Student a, Student b) {
			if(a.age != b.age) {
				return a.age-b.age;
			}else {
				return a.name.compareTo(b.name);
			}
		}
	}
}
