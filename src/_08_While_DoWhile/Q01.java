package _08_While_DoWhile;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
       /* TASK :
        verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code create ediniz
        Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        153 = (1*1*1) + (5*5*5) + (3*3*3) gibi

        */


        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayı gırınız : ");
        int sayı1=scan.nextInt();
        int amstrongSayı=0;
        int sayı2=sayı1;
        int rakam=0;

        while (sayı2>0){
           rakam=sayı2%10;
           sayı2/=10;

            amstrongSayı+=rakam*rakam*rakam;

        }

        if (sayı1==amstrongSayı){
            System.out.println("gırılen sayı amstron sayıdır.");
        }else System.out.println(" sayı amstrong sayı degıl!");
    }

}
