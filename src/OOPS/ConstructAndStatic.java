package OOPS;

public class ConstructAndStatic {
	private static int counter;
	private int age;

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		ConstructAndStatic.counter = counter;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public ConstructAndStatic(int age) {
		this.age = age;
		counter++;
		
	}

	public static void main(String[] args) {
		ConstructAndStatic obj=new ConstructAndStatic(20);
		System.out.println(obj.counter);
		ConstructAndStatic obj2=new ConstructAndStatic(25);
		System.out.println(obj2.counter);
	}

}
