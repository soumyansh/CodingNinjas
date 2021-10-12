package introtojava.lecture7;

import java.util.Scanner;

public class FarenheitToCelsius {
public static void main(String[] args) {
	printFahrenheitTable(0, 100, 20);
}
public static void printFahrenheitTable(int start, int end, int step) {

	
	while(start<=end) {
		System.out.print(start+" "+(5)*(start-32)/9);
		System.out.println();
		
		start=start+step;
	}

}
}
