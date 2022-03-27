package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        /*
        TASK :
        Kullanıcıdan vize ve final notlarını alınız.
        Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
        "Malesef dersten kaldınız..." yazdırınız
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Vize notunuzu gırınız ");
        int vizeNotu = scan.nextInt();

        System.out.println("Final notunuzu giriniz : ");
        int finalNotu = scan.nextInt();

        System.out.println("Vize % kaç etkili : ");
        int vizeYuzdesi = scan.nextInt();
        int finalYuzdesi = 100 - vizeYuzdesi;

        double not = vizeNotu * vizeYuzdesi / 100 + finalNotu * finalYuzdesi / 100;

        if ((vizeNotu >= 0 && finalNotu >= 0) && (vizeNotu <= 100 && finalNotu <= 100)) {

            if (not >= 50) {
                System.out.println("Tebrikler dersi basari ile gectiniz..." + " geçme notunuz : " + not);
            } else {
                System.out.println("Malesef dersten kaldınız...");
            }

        } else {
            System.out.println("Hatalı not gırısı");
        }
    }


}
