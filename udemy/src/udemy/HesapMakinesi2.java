package udemy;

public class HesapMakinesi2 {
	
	public int number1;
	public int number2;
	
	
	
	
	public HesapMakinesi2(int number1, int number2) {
		this.number1=number1;
		this.number2=number2;
	}
	public int toplama() {
		return number1+number2;
	}
	public int çıkarma() {
		if(number1>number2) {
			return number1-number2;
		}
		else {
			return number2-number1;
		}
	}
	public int çarpma() {
		return number1*number2;
	}
	public int bölme() {
		return (int) number1/number2;
	}

}
