package tasks;

import java.util.Random;
import java.util.Scanner;

public class T04_SayiTahminKredili {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * Sayı tahmin etme oyunu.... Bilgisayardan rastle(random class kullanılarak)
         * 0-100 arasında bir sayı alıp kullanıcının tahminini her defasından
         * büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan kod yazınız.
         *
         * TRICK : Random rnd = new Random();
                   int sayi = rnd.nextInt(101); ===> random
           class'indan random objesini kullanilıyor. Daha sonra 'rnd' obj  ile parametresi sinirini belirleyip
           int sayi variable'a assign edilmeli.
         */

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int pcSayi = rnd.nextInt(101);

        System.out.print("1 ile 100 arasında bır tam sayı gırınız : ");
        int kullanıcıTahmin = scan.nextInt();

        tahminiBul(pcSayi, kullanıcıTahmin);


    }

    private static void tahminiBul(int pcSayi, int kullanıcıTahmin) {
        int kredi = 10;


        while (kredi>0) {


            if (kullanıcıTahmin >= 1 && kullanıcıTahmin <= 100) {
                if (pcSayi == kullanıcıTahmin) {
                    System.out.println("Bravo " + (10 - kredi) + ". denemede  bildiniz!");

                    break;
                } else if (pcSayi < kullanıcıTahmin) {
                    System.out.println("Daha kucuk bır sayı gırmelısınız kalan tahmin hakkınız : " + (kredi-1));
                    kullanıcıTahmin = scan.nextInt();


                } else if (pcSayi > kullanıcıTahmin) {
                    System.out.println("Daha buyuk bır sayı gırmelısınız kalan tahmin hakkınız : " + (kredi-1));
                    kullanıcıTahmin = scan.nextInt();

                }

            } else {
                System.out.println("hatalı sayı gırısı!!");
                System.out.println("1 ıle 100 arsında bır sayı gırmelısınız kalan tahmin hakkınız : " + (kredi-1));
                kullanıcıTahmin = scan.nextInt();




            }
            kredi--;
        }
        System.out.println("pc nin sayısı : " + pcSayi + "; sızın tahmınınız : " + kullanıcıTahmin);
    }
}
