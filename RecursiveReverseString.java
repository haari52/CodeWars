package introduction;

public class RecursiveReverseString {

	
	public String reverse(String str){
		String output = "";
		 if(str.length()==1){
			 return str;
		 }else{
			 output += str.charAt(str.length()-1)
			 +reverse(str.substring(0,str.length()-1));
			 return output;
		 }
		
	}
	}


