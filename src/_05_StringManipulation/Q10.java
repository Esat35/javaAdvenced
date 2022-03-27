package _05_StringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*
            TASK :
         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */


        Scanner scan=new Scanner(System.in);
        System.out.print("isim : ");
        String isim=scan.nextLine().toUpperCase(Locale.ROOT);
        System.out.print("Soy isim : ");
        String soyad=scan.next().toUpperCase(Locale.ROOT);
        System.out.print("Kredi kartı numarası : ");
        String krediKartıNo=scan.next();

        System.out.println("İsim : "+isim.substring(0,1)+isim.substring(1).replaceAll("\\w","*"));
        System.out.println("Soyisim : "+soyad.substring(0,1)+soyad.substring(1).replaceAll("\\w","*"));
        System.out.println("Kart no : "+krediKartıNo.substring(0,krediKartıNo.length()-4).replaceAll("\\d","*")+
                krediKartıNo.substring(krediKartıNo.length()-4));

    }
}
