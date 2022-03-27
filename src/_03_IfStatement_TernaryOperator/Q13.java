package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {

    /*  TASK :
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.

        Bu bir dik üçgendir
     */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 adet pozitif sayı gırınız : ");
        double sayı1 = scan.nextDouble();
        double sayı2 = scan.nextDouble();
        double sayı3 = scan.nextDouble();

        if (sayı1 < 0 || sayı2 < 0 || sayı3 < 0) {
            System.out.println("negatif sayı gıremezsınız!");
        } else if (((sayı1 * sayı1 + sayı2 * sayı2) == sayı3 * sayı3) ||
                ((sayı1 * sayı1 + sayı3 * sayı3) == sayı2 * sayı2) ||
                (sayı2 * sayı2 + sayı3 * sayı3) == sayı3 * sayı3) {
            System.out.println("Girdiğiniz degerler bir dik üçgen belirtir.");
        } else {
            System.out.println("Bu bir dik üçgen değildir.");
        }


    }
}
