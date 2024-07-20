package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
 * Set<K> KeySet()
 * Collection<V> values()
 */
public class MapDemo3 {

	public static void main(String[] args) {
		//创建Map对象
		Map<String,String> map = new HashMap<String,String>();
		//添加映射关系
		map.put("s001", "张三");
		map.put("s002", "李四");
		map.put("s005", "李四");
		
		//Set<K> KeySet()：以Set的形式返回所有的key
		Set<String> keys = map.keySet();
		for(String key: keys) {
			System.out.println(key);
		}
		
		System.out.println("----------");
		
		//Collection<V> values()：
		Collection<String> values = map.values();
		for(String value: values) {
			System.out.println(value);
		}
	}
}
