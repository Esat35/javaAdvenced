package _08_While_DoWhile;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        // TASK : GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.


        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayı gırınız : ");
        int num=scan.nextInt();
        int basamakToplamı=0;

        if (num<0){
            num=-num;
        }

do {
    basamakToplamı+=num%10;
    num/=10;
}while (num>0);

        System.out.print("gırılen sayının basamaklarındakı sayıların toplamı : "+basamakToplamı);

    }

}
