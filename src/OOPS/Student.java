package OOPS;

public class Student {

	String name;
	int rollNumber;
	
	public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	public static void main(String[] args) {
		Student s=new Student("Soumya", 20);
		s.print();
	}
	
	public  void print() {
		
		System.out.println(name+":"+rollNumber);
	}
}
