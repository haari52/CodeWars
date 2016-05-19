package introduction;

public class EANValidator {

	/**
	 * @param args
	 */
	 public static boolean validate(final String eanCode) {
		 char givenCSChar =eanCode.charAt(eanCode.length()-1);
		 int givenCS = Character.getNumericValue(givenCSChar);
		 int CS = 0;
		 int count =1;
		 for(int i=0;i<=eanCode.length()-2;i++){
			 char digitChar = eanCode.charAt(i);
			 int digit = Character.getNumericValue(digitChar);
			 if((count%2)==0){
				 count++;
				 CS += digit*3;
			 }else{
				 count++;
				 CS += digit*1;
			 }
		 }
		 if(CS % 10 == 0){
			 CS = 0;
		 }
		 else{
			 CS = 10 -(CS % 10);
		 }
		 if(CS == givenCS){
			 return true;
		 }
		 else{
		 return false;
		 }
	    }
}
