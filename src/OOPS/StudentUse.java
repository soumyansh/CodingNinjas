package OOPS;

public class StudentUse {

	public static void main(String[] args) {
		Student s1=new Student(null, 0);
		s1.name="Ankur";
		s1.rollNumber=12;
		
		Student s2=new Student(null, 0);
		s2.name="Rohit";
		s2.rollNumber=13;
System.out.println(s2.name);		
	}

}
