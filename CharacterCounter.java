package introduction;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {

	/**
	 * @param args
	 */
	 public static boolean validateWord(String word) {
		 Map<Character,Integer> map = new HashMap<Character,Integer>();
		 word = word.toLowerCase();
		 char[] wordChar = word.toCharArray();
		 for(char c:wordChar){
			 if(map.containsKey(c)){
				 map.put(c, map.get(c)+1);
			 }
			 else{
				 map.put(c, 1);
			 }
		 }
		 int value = map.get(wordChar[0]);
		 boolean flag = false;
		 for(Integer m:map.values()){
			  if(value == m){
				  flag = true;
			  }
			  else{
				  flag=false;
				 break;
			  }
		 }
		return flag;
		 }
}
