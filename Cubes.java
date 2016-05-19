package introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cubes {

	public static void main(String[] args){
		Cubes c = new Cubes();
	 System.out.println(c.isSumOfCubes("aqdf& 0 1 xyz 153 777.777"));
	 System.out.println(c.isSumOfCubes("QK29 45[&erui"));
	}
	public String isSumOfCubes(String s) {
		Pattern numP = Pattern.compile("[0-9]{1,3}");
		Matcher numM = numP.matcher(s);
		List<String> res = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		int finalVal = 0;
		while(numM.find()){
			String num = numM.group();
			int sumC = 0;
			for(char c:num.toCharArray()){
				sumC += Math.pow(Character.getNumericValue(c), 3);
			}
			if(sumC == Integer.parseInt(num)){
				res.add(num);
			}
		}
		if(res.size() == 0){
			return "Unlucky";
		}
		else{
			for(String s1:res){
				sb.append(s1+" ");
				finalVal += Integer.parseInt(s1);
			}
			sb.append(finalVal+" ");
			sb.append("Lucky");
			return sb.toString();
		}
	}
}
