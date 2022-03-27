package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
		/*
		  TASK :
		  Kullanici tarafindan girilen bir sayinin
		  mutlak degerini yazdiran code create ediniz.
		 */


        Scanner scan = new Scanner(System.in);

        System.out.print(" bir sayı giriniz : ");
        double sayı = scan.nextDouble();

        if (sayı < 0) {
            System.out.println("mutlak deger : " + (-sayı));
        } else {
            System.out.println("mutlak deger : " + sayı);
        }


    }

}
