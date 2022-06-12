package udemy;

public class Öğrenci1 {
	private int studentno;
	private String name;
	private byte clas;
	private boolean active;
	

    
	public Öğrenci1() {
		System.out.println("the student is taking lesson");
	}
	
	public Öğrenci1(int studentno, String name, byte clas, boolean active) {
    this.studentno=studentno;
    this.active=active;
    this.name=name;
    this.clas=clas;
    
		
	}
	public void studentinfo() {
		if(active==true) {
			System.out.println("student no: " + studentno+ " student name: "+ name + " student class: "+ clas);
			
		}
		else {
			System.out.println("there is no avaliable student!!");
		}
	}
	

}
