package introduction;

public class BracketsChecker {

	public static boolean bracketsChecker(String str) {
		String input = str;
		int curlCounter =0;
		int flowerCounter =0;
		int squareCounter = 0;
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)=='(' || input.charAt(i)==')')
				curlCounter++;
			if(input.charAt(i)== '{' || input.charAt(i)== '}')
				flowerCounter++;
			if(input.charAt(i) == '[' || input.charAt(i) == ']')
				squareCounter++;
		}
		if(curlCounter % 2 == 0 && flowerCounter % 2 ==0 && squareCounter % 2 ==0)
			return true;
		else
			return false;
	}
}
