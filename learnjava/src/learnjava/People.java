package learnjava;

public class People {

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		People.name = name;
	}

	static String name;
	static int age;
	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		People.age = age;
	}
	

	@Override
	public String toString() {
		return "对象people：姓名" + name + " 年龄" + age;
	} 
}
