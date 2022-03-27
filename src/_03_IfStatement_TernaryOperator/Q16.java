package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q16 {
/* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" 3 numara giriniz : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int enBuyuk = num3;

        if (enBuyuk < num1) {
            enBuyuk = num1;
        } else if (enBuyuk < num2) {
            enBuyuk = num2;
        }


        int enKucuk = num1;

        if (num2 < enKucuk) {
            enKucuk = num2;

        } else if (num3 < enKucuk) {

            enKucuk = num3;
        }

        System.out.println("en buyuk sayı : " + enBuyuk + "\nen kucuk sayı : " + enKucuk);
    }
}





