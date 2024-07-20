package set;

import java.util.HashSet;
import java.util.Objects;
/*
 * 使用HashSet存储自定义对象并遍历
 * 
 * HashSet的add()方法，首先会使用当前集合中的每一个元素和新添加的元素进行hash值比较，
 * 如果hash值不一样，则直接添加新的元素
 * 如果hash值一样，比较地址值或者使用equals方法进行比较
 * 比较结果一样，则认为是重复不添加
 * 所有的比较结果都不一样则添加
 */
public class HashSetDemo2 {

	public static void main(String[] args) {
		//创建集合对象
		HashSet<Student> hs = new HashSet<Student>();
		//创建元素对象
		Student s = new Student("张三",18);
		Student s2 = new Student("李四",19);
		Student s3 = new Student("李四",19);
		//添加元素对象
		hs.add(s);
		hs.add(s2);
		hs.add(s3);
		//遍历集合对象
		for(Student student: hs) {
			System.out.println(student);
		}
	}
}

class Student{
	String name;
	int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
}
