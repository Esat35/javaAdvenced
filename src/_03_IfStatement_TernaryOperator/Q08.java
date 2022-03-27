package _03_IfStatement_TernaryOperator;

import java.util.Locale;
import java.util.Scanner;

public class Q08 {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" aldıgınız urunun adedını giriniz.");
        int adet = scan.nextInt();

        System.out.println("Liste fiyatını gırınız ");
        double listeFiyati = scan.nextDouble();

        System.out.println("Müşteri kartiniz var mi? (E/H)");
        String müşteriKart = scan.next().toLowerCase();

        if (müşteriKart.equals("e")) {

            if (adet > 10) {
                listeFiyati = listeFiyati * 80 / 100;
                System.out.println("ödemeniz gereken miktar : " + listeFiyati * adet);

            } else {
                listeFiyati = listeFiyati * 85 / 100;
                System.out.println("odmenız gereken mıktar : " + listeFiyati * adet);
            }


        } else if (müşteriKart.equals("h")) {

            if (adet > 10) {
                listeFiyati = listeFiyati * 85 / 100;
                System.out.println("odmenız gereken mıktar : " + listeFiyati * adet);
            } else {
                listeFiyati = listeFiyati * 90 / 100;
                System.out.println("odmenız gereken mıktar : " + listeFiyati * adet);
            }


        } else {
            System.out.println("hatalı giriş");
        }


    }

}
