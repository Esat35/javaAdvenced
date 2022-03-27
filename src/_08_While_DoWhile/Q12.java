package _08_While_DoWhile;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
         /* TASK :
        Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayı gırınız : ");
        int sayı = scan.nextInt();
        int sayac = 0;

        while (sayac <= sayı) {
            if (sayac % 2 != 0) {
                System.out.print(sayac + " ");
            }
            sayac++;
        }

    }
}
