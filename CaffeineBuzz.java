package introduction;

public class CaffeineBuzz {
	  public static String caffeineBuzz(int n){
	  String str = "";
	  Boolean flag =false;
	  
	  if( n%3 == 0 ){
		  str= "Java";
		  flag = true;
	  }
	 if( n%3 == 0 && n%4 == 0){
	    str= "Coffee";
	    flag = true;
	  }
	  if(!flag){
		return "mocha_missing";
	  }
	  if(flag && n%2 ==0){
	    return str += "Script";
	  }
	  else{
	  	return str;
	    }
	}
	  public static void main(String[] args){
		  System.out.println(caffeineBuzz(1));
		  System.out.println(caffeineBuzz(3));
		  System.out.println(caffeineBuzz(6));
		  System.out.println(caffeineBuzz(120));
	  }
}
