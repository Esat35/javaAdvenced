package _10_List;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class QTasKagitMakas01 {

    public static void main(String[] args) {

        /* TASK:
         tas >makas
         makas >kagit
         kagit >tas

	Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
	Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
	While dongumuzun icerisinde kullanicidan aldigimiz secimi “secim” isimli degiskene atiyoruz.
	Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
	Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
	Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
	En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
	dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.

	 */


        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        do {
            int pc = rnd.nextInt(3)+1;
            System.out.print("* Taş için 1\n* Kağıt için 2\n* Makas için 3\n\nTuşlayınız : ");
            int secim = scan.nextInt();

            System.out.println("pc : "+pc);
            switch (secim) {

                case 1:

                    switch (pc) {
                        case 1:
                            System.out.println("berabere");
                            break;
                        case 2:
                            System.out.println("bilgisayar kazandı.");
                            break;
                        case 3:
                            System.out.println("siz kazandınız.");
                            break;
                        default:
                            System.out.println("hatalı gırış!");
                    }

                    break;

                case 2:

                    switch (pc) {
                        case 1:
                            System.out.println("siz kazandınız.");
                            break;
                        case 2:
                            System.out.println("berabere");
                            break;
                        case 3:
                            System.out.println("bilgisayar kazandı.");
                            break;
                        default:
                            System.out.println("hatalı gırış!");
                    }

                    break;

                case 3:

                    switch (pc) {
                        case 1:
                            System.out.println("bilgisayar kazandı.");
                            break;
                        case 2:
                            System.out.println("siz kazandınız.");
                            break;
                        case 3:
                            System.out.println("berabere");
                            break;
                        default:
                            System.out.println("hatalı gırış!");
                    }

                    break;

                default:

                    System.out.println("hatalı gırış!!!");
            }

            System.out.println("devam etmek istiyor musunuz? (E/H)");

        } while ("e".equals(scan.next().toLowerCase()));


    }
}



