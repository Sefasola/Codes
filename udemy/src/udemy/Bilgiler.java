package udemy;

public class Bilgiler {

	public static void main(String[] args) {
		
		Öğrenci[] model= new Öğrenci[500];
	  
		Öğrenci ögr1= new Öğrenci(2005, "renault", "red", true);
		Öğrenci ögr2 = new Öğrenci(2009, "ahmet" , false);
		Öğrenci ögr3= new Öğrenci("red", "toyota", false );
		model[1]=ögr1;
		model[1].or();
		
		
		
		
		
	}

}
