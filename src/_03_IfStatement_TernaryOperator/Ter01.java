package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter01 {

    public static void main(String[] args) {

        /*
        TASK :
       Kullanicidan bir sayi aliniz
       Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
       10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
       Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
        */
        Scanner scan=new Scanner(System.in);
        System.out.println( "bir sayi giriniz");

        int sayı =scan.nextInt();

        System.out.println((sayı>=0)?(sayı<10?"Rakam":"pozitif sayı"):"negatif sayi");


    }
}
