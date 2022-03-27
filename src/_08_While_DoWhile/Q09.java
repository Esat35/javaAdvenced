package _08_While_DoWhile;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {
        // TASK :  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println(" pın kodunuzu gırınız : ");
        long pın =scan.nextLong();
        int maxValue= Integer.MAX_VALUE;
        System.out.println("max : "+maxValue);

        int minValue= Integer.MIN_VALUE;
        System.out.println("min : "+minValue);
        if (pın<maxValue&&pın>minValue){
            System.out.println("pın dogru");
        }else System.out.println("pın hatalı");

    }
}

