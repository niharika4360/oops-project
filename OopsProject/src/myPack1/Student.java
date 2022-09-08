package myPack1;

public class Student {
	
	
	static String instute_name="Anudip";
	private int roll_Number;
	private String name;
	private int age;
	public Student() {
		super();
		roll_Number=00;
		name="null";
		age=00;
	}
	public Student(int roll_Number, String name, int age) {
		super();
		this.roll_Number = roll_Number;
		this.name = name;
		this.age = age;
	}
	public static String getInstute_name() {
		return instute_name;
	}
	public static void setInstute_name(String instute_name) {
		Student.instute_name = instute_name;
	}
	public int getRoll_Number() {
		return roll_Number;
	}
	public void setRoll_Number(int roll_Number) {
		this.roll_Number = roll_Number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [roll_Number=" + roll_Number + ", name=" + name + ", age=" + age + "]";
	}

}
