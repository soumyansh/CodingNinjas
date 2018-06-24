import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
	    int c=sc.nextInt();
	    if(c==1) {
	    	int sum=0;
	    	int i=1;
	    	while(i<=n) {
	    		sum=sum+i;
	    		i=i+1;
	    	}
	    	System.out.println(sum);
	    }
	    
	    else if(c==2) {
	    	int product=1;
	    	int i=1;
	    	while(i<=n) {
	    		product=product*i;
	    		i=i+1;
	    	}
	    	System.out.println(product);
	    }
	    else System.out.println(-1);

	}

}
