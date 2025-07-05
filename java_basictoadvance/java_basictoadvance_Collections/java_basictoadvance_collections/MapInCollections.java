package java_basictoadvance_collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapInCollections {

	public static void main(String[] args) {
		Map<String,Integer> eceSection= new LinkedHashMap<String,Integer>();
		eceSection.put("Nikhil", 1);
		eceSection.put("Nikhil", 0);
		eceSection.put("Jvs", 2);
		eceSection.put("sai", 3);	
		System.out.println(eceSection);
		
		//keys are set not accepts duplicate
		//values are list accepts duplicate
		
		Map<String,Integer> cseSection= new HashMap<String,Integer>();
		cseSection.put("king", 1);
		cseSection.put("king", 0);
		cseSection.put("queen", 2);
		cseSection.put("sword", 3);
		System.out.println(cseSection);
		System.out.println(cseSection.get("king"));
	}
}
