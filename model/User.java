package mvc_mysql.model;

import java.util.Arrays;

public class User {
	private String name;
	private String email;
	private String pass;
	private String number;
	private String gender;
	private String[] hobby;
	private String course;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] string) {
		this.hobby = string;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", pass=" + pass + ", number=" + number + ", gender="
				+ gender + ", hobby=" + Arrays.toString(hobby) + ", course=" + course + "]";
	}
	
	
	
		
	
			
	
}
