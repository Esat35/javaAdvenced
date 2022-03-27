package _03_IfStatement_TernaryOperator;

import java.util.Locale;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        /*
            TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            54 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Hızınızı gırınız : ");
        int hız = scan.nextInt();

        System.out.println(" Ehliyetiniz var mı? (E/H)");

        boolean ehliyetVarMi = false;

        String cevap = scan.next().toLowerCase();

        if (cevap.equals("e")) {
            ehliyetVarMi = true;
        }


        if (hız < 55) {

            if (ehliyetVarMi) {
                System.out.println("Hız sınırını aşmadınız, cezanız yok.");
            } else {
                System.out.println(" ehliyetiiz olmadıgı ıcın Cezanız : " + 200 + " $");
            }
        } else {
            if (hız >= 55 && hız <= 74) {
                if (ehliyetVarMi) {
                    System.out.println("Cezanız : " + 100 + " $");
                } else {
                    System.out.println("Cezanız : " + 300 + " $");
                }
            } else if (hız >= 75 && hız <= 84) {
                if (ehliyetVarMi) {
                    System.out.println("Cezanız : " + 150 + " $");
                } else {
                    System.out.println("Cezanız : " + 350 + " $");
                }
            } else if (hız >= 85 && hız <= 94) {
                if (ehliyetVarMi) {
                    System.out.println("Cezanız : " + 320 + " $");
                } else {
                    System.out.println("Cezanız : " + 520 + " $");
                }
            } else {
                if (ehliyetVarMi) {
                    System.out.println("Cezanız : " + 500 + " $");
                } else {
                    System.out.println("Cezanız : " + 700 + " $");
                }
            }
        }


    }
}
