package _05_StringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.

       */

        Scanner scan = new Scanner(System.in);
        System.out.println("isim ve soyisminizi giriniz");
        String str = scan.nextLine();

        String isim = str.substring(0, str.indexOf(" ")).trim();
        String soyIsim = str.substring(str.indexOf(" ")).trim();

        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1);
        soyIsim = soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1);


        System.out.println("Isim = " + isim + "\nSoyisim = " + soyIsim);


    }
}
