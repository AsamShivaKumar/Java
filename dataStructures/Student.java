package dataStructures;

public class Student implements Comparable<Student>{
	String name;
	int marks;
        
	Student(String name, int marks){
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		if (this.marks < o.marks) return -1;
		else if (this.marks > o.marks) return 1;
		return 0;
	}
	
}
