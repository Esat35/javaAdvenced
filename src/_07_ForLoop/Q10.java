package _07_ForLoop;

import java.util.Scanner;

public class Q10 {
    /*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("bır harf gırınız : ");
        String harf = scan.next();

        String sesliHarfler = "a,e,i,o,u,A,E,I,O,U";



           if (harf.length()==1&&harf.charAt(0)>='A'&&harf.charAt(0)<='z'){
                if (sesliHarfler.contains(harf)) {
                    System.out.println(" girilen harf sesli bir harf.");
                } else {
                    System.out.println("gırılen harf sessız harf");
                }
            }else System.out.println("yanlıs karakter gırdınız ");




/*
        Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
                değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
        1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

        Sesli harfler: a,e,i,o,u
        */
    }

}


