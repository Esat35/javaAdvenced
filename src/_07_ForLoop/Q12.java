package _07_ForLoop;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

    /*
     TASK :
    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */

Scanner scan=new Scanner(System.in);
        System.out.print("1 den buyuk bır tam sayı gırınız : ");
int sayı=scan.nextInt();
int toplam=0;

if (sayı>=1){
    for (int i = 1; i <=sayı ; i++) {
        toplam+=i*i;
    }
    System.out.println("1 den "+sayı+" sayısına kadar olan sayıların karelerı toplamı : "+toplam);
}else System.out.println(" sayı 1 den kuçuk olamaz.");


    }
}
