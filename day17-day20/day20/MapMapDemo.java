package cn.itcast.demo5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


 
public class MapMapDemo {
	public static void main(String[] args) {
		
		HashMap<String, String> javase = new HashMap<String, String>();
		
		HashMap<String, String> javaee = new HashMap<String, String>();
	
		javase.put("001", "张三");
		javase.put("002", "李四");
		
		javaee.put("001", "王五");
		javaee.put("002", "赵六");
	
		HashMap<String, HashMap<String,String>> czbk =
				new HashMap<String, HashMap<String,String>>();
		czbk.put("基础班", javase);
		czbk.put("就业班", javaee);
		
	
		entrySet(czbk);
	}
	
	public static void entrySet(HashMap<String,HashMap<String,String>> czbk){
		
		Set<Map.Entry<String, HashMap<String,String>>> 
		                         classNameSet = czbk.entrySet();
		Iterator<Map.Entry<String, HashMap<String,String>>> classNameIt = classNameSet.iterator();
		while(classNameIt.hasNext()){
			
			Map.Entry<String, HashMap<String,String>> classNameEntry =  classNameIt.next();
			
			String classNameKey = classNameEntry.getKey();
			
			HashMap<String,String> classMap = classNameEntry.getValue();
		
			Set<Map.Entry<String, String>> studentSet = classMap.entrySet();
	
			Iterator<Map.Entry<String, String>> studentIt = studentSet.iterator();
			while(studentIt.hasNext()){
		
				Map.Entry<String, String> studentEntry = studentIt.next();
			
				String numKey = studentEntry.getKey();
				String nameValue = studentEntry.getValue();
				System.out.println(classNameKey+".."+numKey+".."+nameValue);
			}
		}
			System.out.println("==================================");
		
		for (Map.Entry<String, HashMap<String, String>> me : czbk.entrySet()) {
			String classNameKey = me.getKey();
			HashMap<String, String> numNameMapValue = me.getValue();
			for (Map.Entry<String, String> nameMapEntry : numNameMapValue.entrySet()) {
				String numKey = nameMapEntry.getKey();
				String nameValue = nameMapEntry.getValue();
				System.out.println(classNameKey + ".." + numKey + ".." + nameValue);
			}
		}
	}
	
	public static void keySet(HashMap<String,HashMap<String,String>> czbk){
		
		Set<String> classNameSet = czbk.keySet();
		
		Iterator<String> classNameIt = classNameSet.iterator();
		while(classNameIt.hasNext()){
			
			String classNameKey = classNameIt.next();
			
			Set<String> studentNum = classMap.keySet();
			Iterator<String> studentIt = studentNum.iterator();
	   
     	   while(studentIt.hasNext()){
				
				String numKey = studentIt.next();
				
				String nameValue = classMap.get(numKey);
				System.out.println(classNameKey+".."+numKey+".."+nameValue);
			}
		}
		
		System.out.println("==================================");
	    for(String className: czbk.keySet()){
	       HashMap<String, String> hashMap = czbk.get(className);	
	       for(String numKey : hashMap.keySet()){
	    	   String nameValue = hashMap.get(numKey);
	    	   System.out.println(className+".."+numKey+".."+nameValue);
	       }
	    }
	}

}
