package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Helloworld");
		System.out.println("HüseyinUyanık");
		
		String ortaMetin= "İlginizi cekebilir";
		String altMetin= "Vade Süresi";
		
		
		
		System.out.println(ortaMetin);
		
		int dolarBugun	= 23;
		double dolarDun= 21;
		
		boolean dolarDustuMu= true;
		boolean dolarIndıMı= false;
		
		String okYonu="";
		System.out.println(dolarDustuMu);		
		
		if(dolarBugun>dolarDun) {
			okYonu="up.svg";
			System.out.println(okYonu);
		}
		
		else if(dolarBugun==dolarDun) {
			okYonu="equal.svg";
			System.out.println(okYonu);
			
		}
		else {
			okYonu="down.svg";
			System.out.println(okYonu);
			
		}
		
		String[] krediler= {"ali","veli","49"};
		
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		
		
		for(int i=0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	}
	

}
