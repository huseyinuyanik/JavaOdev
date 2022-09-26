
public class DortIslem {
	
	public  int topla(int... sayilar) {
		
		int toplam=0;
		
		for(int sayi:sayilar) {
			
			toplam=sayi+toplam;
			
		}
		return toplam;
		
		
		
		
	}
	
	public int carp(int... sayilar) {
		
		int carp=1;
		for(int carpan:sayilar) {
			
			carp=carpan*carp;
			
			
		}
		
		return carp;
		
	}
	
	public int bol(int... sayilar) {
		int bolum=1;
		for(int bolen:sayilar) {
			
			bolum=bolen/bolum;
			
			
		}
		
		return bolum;
	}
	
	public int cikar(int... sayilar) {
		int cikarma=0;
		for(int cikan:sayilar) {
			cikarma=cikan-cikarma;
			
		}
		
		return cikarma;
		
	}

}
