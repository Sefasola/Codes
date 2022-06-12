package udemy;

import java.io.ObjectInputStream.GetField;
import java.util.jar.Attributes.Name;

public class Student {

	public static void main(String[] args) {
		Student1 d1= new Student1();
		d1.setname("sefa");
		d1.setnumberofstudent(45);
		d1.setageofstudent(15);
		System.out.println(d1.getageofstudent());
		System.out.println(d1.getnumberofstudent());
		System.out.println(d1.getname());
	  

	}

}

class Student1{
	private int numberofstudent;
	private int ageofstudent;
	private String name;
	
	public Student1() {
		
	}
	public void setnumberofstudent(int numberofstudent) {
		if(numberofstudent>0 && numberofstudent<500) {
			this.numberofstudent=numberofstudent;
		}
		else {
			System.out.println("there is no school");
		}
	}
	
	public int getnumberofstudent() {
		return numberofstudent;
	}
	
	public void setageofstudent(int ageofstudent) {
		if(ageofstudent>0 && 20>ageofstudent) {
			this.ageofstudent=ageofstudent;
		}
		else {
			System.out.println("there is no school");
		}
	}
	
	public int getageofstudent() {
		return ageofstudent;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public String getname() {
		return name;
	}
}
