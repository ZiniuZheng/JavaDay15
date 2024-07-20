package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
 * 使用HashMap存储数据并遍历（自定义对象作为key）
 */

public class HashMapDemo2 {

	public static void main(String[] args) {
		//创建Map对象
		HashMap<Student,String> hm = new HashMap<Student,String>();
		//创建key对象
		Student s = new Student("张三", 18);
		Student s2 = new Student("李四", 20);
		Student s3 = new Student("李四", 20);
		
		//添加映射关系
		hm.put(s, "s001");
		hm.put(s2, "s002");
		hm.put(s3, "s003");
		
		//遍历Map对象
		//方式1：获取所有的key，通过key来获取value
		Set<Student> keys = hm.keySet();
		for(Student key: keys) {
			String value = hm.get(key);
			System.out.println(key + "---" + value);
		}
		System.out.println("--------------------");
		
		//方式2：获取所有结婚证对象，通过结婚证对象获取丈夫和媳妇
		Set<Map.Entry<Student, String>> entrys = hm.entrySet();
		for(Map.Entry<Student, String> entry: entrys) {
			Student key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + "---" + value);
		}
	}
}
