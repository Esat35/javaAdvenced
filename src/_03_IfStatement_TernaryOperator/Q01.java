package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */

        Scanner scan = new Scanner(System.in);// kullanıcıdan input almak için scanner objsi create ettik

        System.out.println("toplama için 1\nçıkarma için 2\nbölme için 3\nçarpma için 4");//kullanıcıya secim için işlem menusu yazdık
        int islem = scan.nextInt();

        System.out.println("Lütfen iki tam sayı giriniz");//kullanıcıya bildirimde bulunduk

        double num1 = scan.nextInt();//1. sayı assing edildi
        double num2 = scan.nextInt();

        if (islem == 1) {
            System.out.println("toplama işleminin sonucu :" + num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (islem == 2) {
            System.out.println("cıkarma işleminin sonucu :" + num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (islem == 3) {
            System.out.println("bolme işleminin sonucu :" + num1 + " / " + num2 + " = " + (num1 / num2));
        } else if (islem == 4) {
            System.out.println("carpma işleminin sonucu :" + num1 + " x " + num2 + " = " + (num1 * num2));
        } else {
            System.out.println("hatalı seçim yaptınız tekrar deneyiniz");
        }


    }

}
