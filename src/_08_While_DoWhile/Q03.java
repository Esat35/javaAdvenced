package _08_While_DoWhile;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
      /*   Kullanicidan 2 sayi alaliniz.
        1. sayi taban
        2. sayi Ust
        1 sayinin ussunu hesaplatan code create ediniz.
         3, 3  sonuc = 27

        2  3 = 2*2*2=8

       */
        Scanner scan = new Scanner(System.in);
        System.out.print("ilk sayısyı gırınız : ");
        int sayı1 = scan.nextInt();
        System.out.print("ikinci sayıyı gırınız : ");
        int sayı2 = scan.nextInt();
        int us=1;
        int usSonucu=1;
        while (us<=sayı2){
        usSonucu*=sayı1;
            us++;
        }
        System.out.println(sayı1+" uzeri "+sayı2+" = "+usSonucu);


    }


}
