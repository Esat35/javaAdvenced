package _07_ForLoop;

import java.util.Scanner;

public class Q13 {
	
	
	public static void main(String[] args) {
		
		/* TASK :
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

		
		Scanner scan=new Scanner(System.in);
		System.out.print("bır cumle gırınız : ");
		String str= scan.nextLine();
		System.out.print("cumlede aradıgınız harfi giriniz : ");
		String arananHarf= scan.next();
		int sayac=0;

		for (int i = 0; i <str.length() ; i++) {

			if (str.substring(i,i+1).equalsIgnoreCase(arananHarf)){
				sayac++;
			}

		}
		System.out.println(str+" içinde "+arananHarf+" "+sayac+" kere kullanılmıs");
	}

}
