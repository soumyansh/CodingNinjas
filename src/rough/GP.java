package rough;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class GP {
public static void main(String[] args) {
	System.out.println(findGeometricSum(9));;
}
public static double findGeometricSum(int k){
	
	
	 
	double sum=0;
	for (int i = 0; i <=k; i++) {
		sum=sum+(1/Math.pow(2, i));
		
	}
		return (sum);
		
	
	}

}

