package classes;

import java.util.Date;

public class Student {

	private String name; // name has default value null
	private int age; // age has default value 0
	private boolean isScienceMajor; // isScienceMajor has default value false
	private char gender; // c has default value '\u0000'
	private Date birthDate; // has default of null
	private int id;
	private static int numberOfStudents=0;
	
	
	
	public Student(String name, int age, boolean isScienceMajor, char gender, Date birthDate) {
		super();
		this.name = name;
		this.age = age;
		this.isScienceMajor = isScienceMajor;
		this.gender = gender;
		this.birthDate = birthDate;
		this.id = numberOfStudents++;
	}

	public String getName() {
		return this.name;
		
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

	public boolean isScienceMajor() {
		return isScienceMajor;
	}

	public void setScienceMajor(boolean isScienceMajor) {
		this.isScienceMajor = isScienceMajor;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}


	public static int getNumberOfStudents() {
		return numberOfStudents;
	}

	public static void main(String[] arg) {
		//Student s = new Student();
		Date d = new Date();
		System.out.println(d.getTime());
		System.out.println(d);
	}
}
