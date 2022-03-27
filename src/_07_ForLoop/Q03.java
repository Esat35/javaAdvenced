package _07_ForLoop;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)

         */

        Scanner scan = new Scanner(System.in);

        System.out.print("bir cumle gırınız : ");
        String str = scan.nextLine();
String harf="";
int sayac=0;
        for (int i = 0; i <str.length() ; i++) {

         harf=   str.substring(i,i+1);
         if (harf.equalsIgnoreCase("c")){
            break;
         }else if (harf.equalsIgnoreCase("a")){
             sayac++;
         }


        }
        System.out.println(" gırılen cumledeki a harfı sayı : "+sayac);

    }
}
