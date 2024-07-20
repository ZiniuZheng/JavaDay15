package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
 * Map的第二种遍历方式：
 * 		通过结婚证对象来获取丈夫和媳妇
 * Set<Map.Entry<K,V>> entrySet()
 */
public class MapDemo5 {

	public static void main(String[] args) {
		//创建Map对象
		Map<String,String> map = new HashMap<String,String>();
		//添加映射关系
		map.put("尹志平", "小龙女");
		map.put("令狐冲", "东方姑娘");
		map.put("玄慈", "叶二娘");
		//获取所有的结婚证对象
		Set<Map.Entry<String, String>> entrys = map.entrySet();
		//遍历包含了结婚证对象的集合
		for(Map.Entry<String, String> entry: entrys) {
			//获取每个单独的结婚证对象
			//通过结婚证对象获取丈夫和媳妇
			String key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println("丈夫: " + key + "---" + "媳妇: " + value);
		}
	}
}
