package _07_ForLoop;

import java.util.Scanner;

public class Q20 {
    /*
     * SORU 1 Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak
     * Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin. Input : 30 40
     * Beklenen Cikti: 30 ve 40 icin EBOB = 10    30 ve 40 icin EKOK = 120
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("2 pozitif tam sayı gırınız : ");
        int sayı1 = scan.nextInt();
        int sayı2 = scan.nextInt();
        int ebob = 1;
        int ekok = 1;
        int buyukSayı = 0;

        if (sayı1 > 0 && sayı2 > 0) {

            if (sayı1 < sayı2) {
                buyukSayı = sayı2;
            } else {
                buyukSayı = sayı1;
            }


            for (int i = 1; i <= buyukSayı; i++) {

                if (sayı1 % i == 0 && sayı2 % i == 0) {
                    ebob = i;
                }


            }


            for (int j = 1; j < sayı2 * sayı1; j++) {
                if (j % sayı1 == 0 && j % sayı2 == 0) {
                    ekok = j;
                    break;
                }
            }


        }
        System.out.println("negatif sayı gıremezsınız!");

        System.out.println("gırılen sayıların \nEBOB'u : " + ebob + "\nEKOK'u : " + ekok);

    }
}
