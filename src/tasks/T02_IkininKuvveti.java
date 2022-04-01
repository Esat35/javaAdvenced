package tasks;

import java.util.Scanner;

public class T02_IkininKuvveti {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("bir sayı gırınız : ");
        int sayı = scan.nextInt();

        boolean isPowerOfTwo = powersOfTwo(sayı);
        System.out.println(isPowerOfTwo);


    }

    private static boolean powersOfTwo(int sayı) {
        boolean isPower = false;

        if (sayı == 1) {
            System.out.println(sayı + " sayısı 2'nın 0. kuvvetidir.");
            isPower = true;
        } else {
            int uss = 0;
            for (int i = 2; i <= sayı; i *= 2) {
                uss++;
                if (sayı == i) {
                    isPower = true;
                    System.out.println(sayı + " sayısı 2'nın " + uss + ". kuvvetidir.");
                }
            }

        }


        return isPower;
    }
}

