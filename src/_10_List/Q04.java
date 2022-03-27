package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */

        List<Double> notlar = new ArrayList<Double>();
        Scanner scan= new Scanner(System.in);
        String cevap="";
        int toplamNotlar = 0;

        do {
            System.out.print("ogrencı notu gırınız : ");
            double not=scan.nextDouble();
            toplamNotlar+=not;
            notlar.add(not);
            System.out.println("not gırısıne devam etmek ıstıyor musunuz? (E/H) ");
            cevap= scan.next().toLowerCase(Locale.ROOT);
        }while (!cevap.equals("h"));


        System.out.println("ortalama : "+toplamNotlar/notlar.size());

     int   ortalamayıGecenOgrenciSayisi=0;

        for (int i = 0; i <notlar.size() ; i++) {
            if (notlar.get(i)>toplamNotlar/notlar.size()){
                ortalamayıGecenOgrenciSayisi++;
            }

        }

        System.out.println("ortalamanın ustundekı ogrencı sayısı : "+ortalamayıGecenOgrenciSayisi);

    }
}
