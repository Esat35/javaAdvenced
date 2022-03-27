package _09_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManavProject {
    /*
     * Basit bir 5 ürünlü manav alisveris programi yaziniz.
     *
     * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
     * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
     *            istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
     *            Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
     * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
     * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
     *
     * */

    static List<String> urunListesi = new ArrayList<String>();
    static List<Double> urunFiyatları = new ArrayList<Double>();
    static double toplamOdeme;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        urunListesi.add("domat - urun kodu : 1");
        urunListesi.add("muz - urun kodu : 2");
        urunListesi.add("elma - urun kodu : 3");
        urunListesi.add("erik - urun kodu : 4");
        urunListesi.add("çilek - urun kodu : 5");

        urunFiyatları.add(15.0);
        urunFiyatları.add(18.0);
        urunFiyatları.add(8.0);
        urunFiyatları.add(47.0);
        urunFiyatları.add(27.0);

        musteriSecim();


    }

    private static void musteriSecim() {
        for (int i = 0; i < urunListesi.size(); i++) {
            System.out.println(urunListesi.get(i));

        }

        System.out.print("sectıgınız urunun kodunu gırınız : ");
        int secim = scan.nextInt();

        System.out.print("sectıgınız urunden kac kg. alacaksınız : ");
        double kilo = scan.nextDouble();
        double urunTutarı = kilo * urunFiyatları.get(secim - 1);
        toplamOdeme += urunTutarı;

        System.out.println("devam etmek için 1 kasa için 2 ye basınız ");
        int devamkee = scan.nextInt();

        if (devamkee == 1) {
            musteriSecim();
        } else {
            kasa();
        }
    }

    private static void kasa() {
        System.out.println("toplam odemenız : " + toplamOdeme + " Tl." + " \nıyı gunler..");
    }
}
