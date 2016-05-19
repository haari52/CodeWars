package introduction;

public class TriangleNumbers {

	public static Boolean isTriangleNumber(long number) {
		
		long n = 8*number +1;
		if(n < 0){
		return false;
		}
		long num = (long) (Math.sqrt(n)+0.5);
		return num * num == n;
	}
}
