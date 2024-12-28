package bean;

public class StudentBean {
	
	private String name;
    private int age;
    private String major;
    private String year;
	public StudentBean(String name, int age, String major, String year) {
		super();
		this.name = name;
		this.age = age;
		this.major = major;
		this.year = year;
	}
	public StudentBean() {
		super();
	}
	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", age=" + age + ", major=" + major + ", year=" + year + "]";
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
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
}
