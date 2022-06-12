package udemy;

public class Static {

	public static void main(String[] args) {
	Memur d1= new Memur();
	d1.setmaas(4000);
	d1.setname("ahmet");
	
	Memur d2= new Memur();
	d2.setmaas(5000);
	d2.setname("ayşe");
	d1.memurinfo();
	d2.memurinfo();
	System.out.println(Memur.makingmemurobject);
  
	}
}
	
	class Memur {
		private String name;
		private int maas;
		public static int makingmemurobject;
		
		public Memur() {
			makingmemurobject++;
		}
		public String  getname() {
			return name;
		}
		 public void setname(String name) {
			 this.name=name;
		 }
		 public int getmaas() {
			 return maas;
			 
		 }
		 public void setmaas(int maas) {
			 if(maas<0) {
				 maas=0;
			 }
			 else {
				 this.maas=maas;
			 }
		 }
		 
		 public void memurinfo() {
			 System.out.println("info which is about memur :" + makingmemurobject);
		 }
	}


