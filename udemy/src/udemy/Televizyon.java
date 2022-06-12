package udemy;

public class Televizyon {
	
	private int canal;
	private int sesLevel;
	private boolean ac;
	
	public void setcanal(int newcanal) {
		
		if(ac && newcanal>0 && newcanal<500) {
			canal=newcanal;
		}
		else {
			System.out.println("tv is closed pr you are wrong");
		}
	}
	
	public int getcanal() {
		return canal;
	}
	
	public int getseslevel() {
		return sesLevel;
	}
	public void setseslevel(int seslevel) {
		if(ac && seslevel>0 && 20>seslevel) {
			this.sesLevel=seslevel;
		}else {
			seslevel=1;
		}
		
				
	}
	
	public void acık() {
		if(ac==false) {
			System.out.println("tv is opening ");
			ac=true;
		}
		else {
			System.out.println("tv is already opened");
		}
	}
	public void kapalı() {
		if(ac==true) {
			System.out.println("tv is closing ");
			ac=false;
		}
		else {
			System.out.println("tv is already closed.");
		}
	}

}
