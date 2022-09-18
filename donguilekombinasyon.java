package bukodyazilmadanogrenilmez;

import java.util.Scanner;

public class donguilekombinasyon {

	public static void main(String[] args) {
		
		int n,r;
		int a=1;
		int b=1;
		int c=1;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("baslangic sayisi giriniz: ");
		n = scan.nextInt();
		
		System.out.print("bitis sayisi giriniz: ");
		r = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			a *= i;
			
		}for(int j=1; j<=r; j++) {
			b *= j;
		}
		
		 for (int k = 1; k <= (n - r); k++) {
             c *= k;
         }
		int kombinasyon = a / (b*c);
		System.out.println("sonuc" + kombinasyon);
				

	}

}
