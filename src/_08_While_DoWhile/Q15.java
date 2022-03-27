package _08_While_DoWhile;

import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
         /* TASK :
        Verilen iki sayının kombinasyonunu bulan kodu yazınız.
        Hatırlatma C(n,r) = n! / (r!(n-r)!)

        Ekran Çıktısı
        Birinci sayıyı giriniz: 15
        Ikinci sayıyı giriniz: 4
        Kombinasyon: 1365

        Birinci sayıyı giriniz: 5
        Ikinci sayıyı giriniz: 3
        Kombinasyon: 10

      */


        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci ayıyı gırınız : ");
        int sayı1 = scan.nextInt();

        System.out.print("İkinci sayıyı gırınız : ");
        int sayı2 = scan.nextInt();


      long combinasyon = faktoryelBul(sayı1) / (faktoryelBul((sayı1 - sayı2)) * faktoryelBul(sayı2));

        System.out.println("C("+sayı1+","+sayı2+")="+combinasyon);
    }

    public static long faktoryelBul(int sayı) {
        long carpım = 1;

       while (sayı>=1){
           carpım*=sayı;
           sayı--;
       }

        return carpım;
    }
}

