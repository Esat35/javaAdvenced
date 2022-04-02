package _12_Varargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        // verilen int lerden ilki haric tum sayilari toplayan ve
        // buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.

Scanner scan=new Scanner(System.in);


            System.out.print("bır sayı gırınız :");
            int sayı1=scan.nextInt();

        System.out.print("bır sayı gırınız :");
        int sayı2=scan.nextInt();

        System.out.print("bır sayı gırınız :");
        int sayı3=scan.nextInt();

        System.out.print("bır sayı gırınız :");
        int sayı4=scan.nextInt();

        topla(sayı1,sayı2,sayı3,sayı4);

    }

    public static void topla(int carpilacakSayi, int... toplanacakSayilar) {

        int toplam=0;
        for (int each:toplanacakSayilar
             ) {
            toplam+=each;
        }

        System.out.println("sonuc : "+carpilacakSayi*toplam);
    }
}
