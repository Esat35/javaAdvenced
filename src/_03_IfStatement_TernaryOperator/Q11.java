package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

    /* TASK :
        Kullanıcıdan bir tarihi gün, ay ve yıl şeklinde alıp bu tarihi
        ay, gün, yıl ve yıl, ay, gün sıralarına çevirerek yazan bir kod yazınız.



        Örnek Ekran Çıktısı
        Lütfen günü giriniz: 10
        Lütfen ayı giriniz: 02
        Lütfen yılı giriniz: 2009
        Gün ay yıl: 10.02.2009
        Ay gün yıl: 02.10.2009
        Yıl ay gün: 2009.02.10
        */

        Scanner scan = new Scanner(System.in);
        System.out.println(" Lütfen günü giriniz:");
        String gun = scan.next();

        System.out.println("Lütfen ayı giriniz:");
        String ay = scan.next();

        System.out.println("Lütfen yılı giriniz:");
        String yıl = scan.next();

        System.out.println("Gün ay yıl: " + gun + "." + ay + "." + yıl);
        System.out.println("Yıl ay gün: " + yıl + "." + ay + "." + gun);


    }
}
