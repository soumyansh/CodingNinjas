import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useDelimiter("\\s");
		double basic_sal = sc.nextInt();
		char grade = sc.next().toUpperCase().charAt(0);
		double hra = (20 * basic_sal) / 100;
		double da = (50 * basic_sal) / 100;
		double allow;
		if (grade == 'A') {
			allow = 1700;
		} else if (grade == 'B') {
			allow = 1500;
		} else {
			allow = 1300;
		}
		double pf = (11 * basic_sal) / 100;
		double totalSalary =  (basic_sal + hra + da + allow - pf);
         int finalSalary=(int) Math.round(totalSalary);
System.out.println(finalSalary);
	}

}
