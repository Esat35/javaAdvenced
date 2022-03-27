package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("yasınızı gırınız : ");
        int yas = scan.nextInt();

        System.out.println("kilonuzu gırınız : ");
        double kilo = scan.nextDouble();

        if (yas < 18) {
            System.out.println(" kan bagısı yapamazsınız. ");
        } else {
            if (kilo < 50) {
                System.out.println(" kan bagısı yapamazsınız. ");
            } else {
                System.out.println("kan bagısı yapabılırsınız");
            }

        }


    }

}
