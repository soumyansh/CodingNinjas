package rough;

public class CountOfZeros {
public static void main(String[] args) {
	System.out.println(countZerosRec(0));
}
public static int countZerosRec(int input){
	int count=0;
	if(input==0) {
		return 1;
	}
	while(input>0) {
		if(input%10==0) {
			count++;
		}
		input=input/10;
	}
	return count;
}
}
