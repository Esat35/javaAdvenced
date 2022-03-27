package _06_Method_Creation;

import java.util.Scanner;

public class Q10 {

    /*
         TASK :
        powerOfThree isminde bir Parametre olarak int Return tipi boolean method create edin.
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını kontrol edin. 3'ün üssü(kuvveti) ise true, değilse false return edin.
        Örnek 1:
        input: 27
        output: true

        Örnek 2:
        Girdi: 0
        Çıktı: false

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir tam sayı gırınız : ");
        int sayı = scan.nextInt();


        boolean sonuc = powerOfThree(sayı);

        System.out.println(sonuc);


    }

    private static boolean powerOfThree(int sayı) {
        boolean ısPowerOfThree = false;

        for (int i = 3; i <= sayı; i *= 3) {
            if (sayı == i) {
                ısPowerOfThree = true;
            }
        }

        return ısPowerOfThree;
    }

}
