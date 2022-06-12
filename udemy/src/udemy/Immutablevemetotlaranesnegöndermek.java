package udemy;

import java.security.KeyStore.PrivateKeyEntry;

public class Immutablevemetotlaranesnegöndermek {

	public static void main(String[] args) {
		String[] üreticifiralar= {"dell", "samsung", "iphone"};
		Bilgisayar d1= new Bilgisayar(2, 16, üreticifiralar);
		String[] üreticiler= d1.getUreticifirmalar();
		üreticiler[0]="apple";
		computer(d1);
	}
	
	public static void computer(Bilgisayar yazılıcakBilgisayar) {
		System.out.println("cekirdek sayısı: "+ yazılıcakBilgisayar.getCekirdeksaysısı()+" ram miktarı "+ yazılıcakBilgisayar.getRamboyuru() +
				" üretici firmalar " + yazılıcakBilgisayar.getUreticifirmalar()[0]);
	}

}


class Bilgisayar {
	private int cekirdeksaysısı;
	private int ramboyuru;
	private String[] ureticifirmalar;
	
	public Bilgisayar(int csayısı, int ramboyu, String[] ure) {
	    cekirdeksaysısı=csayısı;
		ramboyuru=ramboyu;
		ureticifirmalar=ure;
	}
	
	public int getCekirdeksaysısı() {
		return cekirdeksaysısı;
	}
	
	public int getRamboyuru() {
		return ramboyuru;
	}

	public String[] getUreticifirmalar() {
		return ureticifirmalar;
	}
	
	
}
