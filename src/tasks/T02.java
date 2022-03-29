package tasks;

import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */

        Scanner scan=new Scanner(System.in);

        System.out.print("bir sayı gırınız : ");
        int sayı = scan.nextInt();

       boolean isPowerOfTwo =powersOfTwo(sayı);
        System.out.println(isPowerOfTwo);


    }

    private static boolean powersOfTwo(int sayı) {
        boolean isPower=false;
        for (int i = 2; i <=sayı ; i*=2) {

            if (sayı==i){
                isPower=true;
            }
        }


        return isPower;
    }
}

