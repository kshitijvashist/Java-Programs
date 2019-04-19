package problems.kshitij.string;

import java.util.HashMap;
import java.util.Map;

public class CustomSplitProblem {

	public static void main(String args[])
	{
		String inputString="F1,F2,F3,F4,F5-1,2,3,4,5";
		
		String[] splitArray=inputString.split("-");
		Map<String, String> map=new HashMap<>();
		
		String[] getKeys=splitArray[0].split(",");
		String[] getValues=splitArray[1].split(",");
		
		
		for(int i=0;i<getKeys.length;i++)
		{
			
			map.put(getKeys[i], getValues[i]);
		}
		
		for(Map.Entry<String, String> hmap:map.entrySet())
		{
			System.out.println(hmap.getKey()+" "+hmap.getValue());
		}
	}
}
