package _04_switchCase;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
// 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.println(" 3 basamaklı bır sayı gırınız");
        int sayı = scan.nextInt();
        int birlerBasamagı = sayı % 10;
        sayı /= 10;
        int onlarBasamagı = sayı % 10;
        sayı /= 10;
        int yuzlerBasamagı = sayı % 10;


        switch (yuzlerBasamagı) {

            case 1:
                System.out.print(" yuz");
                break;
            case 2:
                System.out.print(" iki yuz");
                break;
            case 3:
                System.out.print(" üç yuz");
                break;
            case 4:
                System.out.print(" dört yuz");
                break;
            case 5:
                System.out.print(" beş yuz");
                break;
            case 6:
                System.out.print(" altı yuz");
                break;
            case 7:
                System.out.print(" yedi yuz");
                break;
            case 8:
                System.out.print(" sekiz yuz");
                break;
            case 9:
                System.out.print(" dokuz yuz");
                break;

        }


        switch (onlarBasamagı) {
            case 0:
                System.out.print(" ");
                break;
            case 1:
                System.out.print(" on");
                break;
            case 2:
                System.out.print(" yirmi");
                break;
            case 3:
                System.out.print(" otuz");
                break;
            case 4:
                System.out.print(" kırk");
                break;
            case 5:
                System.out.print(" elli");
                break;
            case 6:
                System.out.print(" altmış");
                break;
            case 7:
                System.out.print(" yetmiş");
                break;
            case 8:
                System.out.print(" seksen");
                break;
            case 9:
                System.out.print(" doksan");
                break;

        }

        switch (birlerBasamagı) {
            case 0:
                System.out.print("");
                break;
            case 1:
                System.out.print(" bir");
                break;
            case 2:
                System.out.print(" iki ");
                break;
            case 3:
                System.out.print(" üç");
                break;
            case 4:
                System.out.print(" dört ");
                break;
            case 5:
                System.out.print(" beş ");
                break;
            case 6:
                System.out.print(" altı ");
                break;
            case 7:
                System.out.print(" yedi ");
                break;
            case 8:
                System.out.print(" sekiz ");
                break;
            case 9:
                System.out.print(" dokuz ");
                break;


        }
    }
}