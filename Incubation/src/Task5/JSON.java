package Task5;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONArray array = new JSONArray();
		JSONObject object = new JSONObject();
		array.put("Tamil");
		array.put("English");
		array.put("Maths");
		array.put("Science");
		array.put("Social");
		object.put("Subjects",array);
		object.put("Age", 23);
		object.put("Class", 10);
		JSONObject object1 = new JSONObject();
		//JSONArray array1 = new JSONArray();
		object1.put("Rajesh",object);
		System.out.println(object1);
		//System.out.println(object1.get("Class"));
		int m =(int) object.get("Class");
		//System.out.println(m);
		System.out.println(( object1.get("Rajesh")));
		//System.out.println(object.get("Class"));
		System.out.println(object.get("Class"));
		System.out.println(object.get("Subjects"));
		System.out.println(object.get("Age"));
		System.out.println(object.get("Subjects"));
	}

}
