package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QFibonacci {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("bır pozıtıf tam sayı gırınız : ");
        int sayı = scan.nextInt();
        int sayı1 = 1;
        int sayı2 = 1;
        int sayı3 = 0;
        System.out.print(sayı1+" ");
        System.out.print(sayı2+" ");

        if (sayı > 0) {
            for (int i = 0; i < sayı; i++) {
                sayı3=sayı1+sayı2;
                sayı1=sayı2;
                sayı2=sayı3;
                System.out.print(sayı3+" ");
            }


        } else System.out.println("pozıtıf tam sayı gırmelısınız!");


    }
}
