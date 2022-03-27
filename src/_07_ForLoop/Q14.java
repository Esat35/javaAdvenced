package _07_ForLoop;

import java.util.Scanner;

public class Q14 {

    /*  TASK :
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */

     /*
                    *
                    * *
                    * * *
                    * * * *
                    * * * * *
                    şeklini yazdırınız
             */

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }
            System.out.println("\n\n===========================\n\n");


         for (int k = 0; k < 5; k++) {

                for (int l = 0; l <= k; l++) {
                    System.out.print("*");
                }
                System.out.println();
            }


        }
    }
