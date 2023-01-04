package garbage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapHash {

	public static void main(String[] args) 
	{
		HashMap<String,String> map = new HashMap<>();
		map.put("Name","Rajesh");
		map.put("Company","Zoho");
		map.put("Role","Developer");
		System.out.println(map);
		System.out.println(map);
		for(Map.Entry<String, String> a: map.entrySet())
		{
			System.out.println(a.getKey()+" - "+a.getValue());
		}
	}

}
