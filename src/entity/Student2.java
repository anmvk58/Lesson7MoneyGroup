package entity;

public class Student2 {
	private int id;
	private String name;
	private static String college;
	private static int moneyGroup = 0;
	
	public Student2(int id, String name) {
		this.id = id;
		this.name = name;
		this.moneyGroup += 100;
	}
	
	public void nopTien(int amount) {
		this.moneyGroup += amount;
	}
	
	public void layTien(int amount) {
		this.moneyGroup -= amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getCollege() {
		return college;
	}

	public static void setCollege(String college) {
		Student2.college = college;
	}
	
	
	public static int getMoneyGroup() {
		return moneyGroup;
	}

	public static void setMoneyGroup(int moneyGroup) {
		Student2.moneyGroup = moneyGroup;
	}

	@Override
	public String toString() {
		return "Id: " + this.id + " | Name: " + this.name + " | College: " + this.college; 
	}
}
