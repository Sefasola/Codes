package udemy;

public class CemberDaire implements Cember{
	
	//pi r
	private int pi;
	private int r;
	
	public CemberDaire(int pi, int r) {
		this.pi=pi;
		this.r=r;
	}

	@Override
	public int getarea() {
		
		return (pi*r*r);
	}

	@Override
	public int getperimeter() {
		
		return 2*pi*r;
	}
	
	
	

}
