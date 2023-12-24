package mukemmelSayiKontrol;


import java.util.Scanner;

public class MukemmelSayiKontrol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// kullanicidan sayi al
		System.out.print("Bir sayi giriniz: ");
		int sayi = scanner.nextInt();
		
		// mukemmel sayi kontrolu
		if (mukemmelSayiMi(sayi)) {
			System.out.println(sayi + " mukemmel sayidir.");
			
			
		} else {
			System.out.println(sayi + " mukemmel sayi degildir.");
			
		}
		scanner.close();
		
	}
	// mukemmel sayi kontrolu yapan fonksiyon
	static boolean mukemmelSayiMi(int sayi) {
		if (sayi <= 0) {
			return false;
			
		}
		int toplam =0;
		
		// sayinin pozitif tam sayi carpanlarini bulma
		for (int i = 1; i <= sayi/2 ; i++) {
			if (sayi % i ==0) {
				toplam +=i;
				
			}
			
		}
		
		// toplam, sayinin kendisine esitse mukemmel sayidir
		return toplam == sayi;
		

  }
}