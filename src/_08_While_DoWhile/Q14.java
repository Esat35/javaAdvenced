package _08_While_DoWhile;

import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
        /* TASK :
        Verilen bir sayının faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazınız.

        Örnek Ekran Çıktıları
        Bir sayi giriniz: 6*5*4*3*2*1=720
        Faktöriyeli: 720

        Bir sayı giriniz: 3*2*1
        Faktöriyeli 6
     */

        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayı gırınız : ");
        int sayı = scan.nextInt();

        if (sayı >= 0) {
            int faktoryel = faktoryelBul(sayı);

            System.out.print("=" + faktoryel + "\nfaktoryeli : " + faktoryel);

        } else System.out.println("negatiff sayı gırdınız!");


    }

    private static int faktoryelBul(int sayı) {
        int carpım = 1;

        while (sayı >= 1) {
            sayıCarpımOlarakYaz(sayı);
            carpım *= sayı;
            sayı--;
        }
        return carpım;
    }

    private static void sayıCarpımOlarakYaz(int sayı) {

        if (sayı != 1) {
            System.out.print(sayı + "*");
        } else System.out.print(sayı);

    }


}


