package udemy;

public class Öğrenci {
	int date;
	String model;
	String colour;
	boolean aktif;
	
	public void setöğrencino(int yeniöğrencino) {
		
	}
	
	public int getöğrencino() {
		return this.date;
	}

	
	public Öğrenci(int date, String model, String colour, boolean aktif) {
		this.date=date;
		this.model=model;
		this.colour=colour;
		this.aktif=aktif;
	}
	
	public Öğrenci(int number, String str, boolean aktif) {
		this.date=number;
		this.model=str;
		this.aktif=aktif;
	}
	
	public Öğrenci(String str, String name, boolean aktif) {
		colour=str;
		model=name;
		this.aktif=aktif;
	}
	
	public void or() {
		if(aktif==true) {
			System.out.println("the car that you want us to find it");
		}
		else {
			System.out.println("the car that you want us not to find");
			System.out.println(this.aktif);
            System.out.println(this.colour);
            System.out.println(this.date);
            System.out.println(this.model);
            
		}
		
		
		
		
			
	}
	
	
}
