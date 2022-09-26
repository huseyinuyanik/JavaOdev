package methods2;

public class Main {

	public static void main(String[] args) {
		
		String mesaj="Bugun hava cok güzel";
		String yeniMesaj= sehirVer();
		System.out.println(yeniMesaj);
		int sayi= topla(5,7);
		System.out.println(sayi);
		System.out.println(topla(2,4));
		
		int carpim1=carp(1,2,3,4,5);
		System.out.println(carpim1);
		

	}
	
	public static void ekle() {
		
		System.out.println("Eklendi");
		
		
	}
	
	public static void sil() {
		
		System.out.println("Silindi");
		
	}
	
	public static void guncelle() {
		
		System.out.println("Guncelledi");
		
		
		
		
		
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
		
		
		
	}
	
	public static String sehirVer() {
		return "Ankara";
		
		
	}
	
	public static int carp(int... sayilar) {
		
		int carpim=1;
		for(int sayi:sayilar) {
			carpim=sayi*carpim;
			
			
			
		}
		return carpim;
		
	}

}
