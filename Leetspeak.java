package introduction;

public class Leetspeak extends Encoder {
	
	 public String encode(String source){
		    if(source==null){
		    	return "";
		    }
		    else{
		    	String str = source;
		    	StringBuilder output = new StringBuilder();
		    	for(int i=0;i<str.length();i++){
		    		if(str.charAt(i)=='a'||str.charAt(i)=='A')
		    			output.append(4);
		    		else if(str.charAt(i)=='e'||str.charAt(i)=='E')
		    			output.append(3);
		    		else if(str.charAt(i)=='l'||str.charAt(i)=='L')
		    			output.append(1);
		    		else if(str.charAt(i)=='m'||str.charAt(i)=='M')
		    			output.append('/').append('^').append('^').append('\\');
		    		else if(str.charAt(i)=='o'||str.charAt(i)=='O')
		    			output.append(0);
		    		else if(str.charAt(i)=='u'||str.charAt(i)=='U')
		    			output.append("(_)");
		    		else
		    			output.append(str.charAt(i));
		    			
		    	}
		    	System.out.println("output "+output.toString());
		    	return output.toString();
		    }
		  }
}
 
abstract class Encoder{
	  public abstract String encode(String source);
	}
