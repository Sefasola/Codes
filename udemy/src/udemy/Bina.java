package udemy;

public class Bina implements İnformation{
	
	public int daire;
	public int insan;
	public int bina;
	public String binatürü;
	public String binarengi;
	
	public Bina(int daire, int insan, int bina, String binatürü, String binarengi) {
		this.bina=bina;
		this.binatürü=binatürü;
		this.daire=daire;
		this.insan=insan;
		this.binarengi=binarengi;
		//binada yaşayan toplam kişi sayısı =daire*insan;
		//tokide yaşayan toplam kişi sayısı= daire*insan*bina;
	}

	@Override
	public int binadayaşayankişi() {
		
		return daire*insan;
	}

	@Override
	public int tokideyaşayankişi() {
				return daire*insan*bina;
	}

	@Override
	public String binarengi() {
		return binarengi;
	}

	@Override
	

	

	
	
}
