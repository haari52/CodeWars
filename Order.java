package introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Order {

		  public static String order(String words) {
			  String[] str = words.split(" ");
			  String output="";
			  int count=0;
			  Map<Integer,String> map = new HashMap<Integer,String>();
			  for(String s:str){
				  for(char c:s.toCharArray()){
					  if(Character.isDigit(c)){
						  map.put((int)c, s);
					  }
				  }
			  }
			 Set<Entry<Integer,String>> set = map.entrySet();
			  List<Entry<Integer, String>> list = new ArrayList<Entry<Integer, String>>(set);
		      Collections.sort( list, new Comparator<Map.Entry<Integer, String>>()
		        {
					@Override
					public int compare(Entry<Integer, String> o1,
							Entry<Integer, String> o2) {
						return (o1.getKey()).compareTo( o2.getKey() );
					}
		        } ); 
		        for(Map.Entry<Integer, String> entry:list){
		        	output += entry.getValue();
		        	count++;
		        	if(count<=list.size()-1){
		        	output +=" ";
		        	}
		        }
			return output;
		  }
		  
}
