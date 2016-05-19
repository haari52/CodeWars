package introduction;

public class SmallestIntegerFinder {

	public static int findSmallestInt(int[] args) {
		int[] array = args;
		int num = array[0];
		for(int i=0;i<array.length;i++){
				if(array[i]<=num){
					num = array[i];
				}
		}
		return num;

    }
}
