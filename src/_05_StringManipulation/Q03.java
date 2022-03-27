package _05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("3 kelimeden olusan bır ısım gırınız");
        String str= scan.nextLine();

        int ilkSpace=str.indexOf(" ");
        int sonSpace=str.lastIndexOf(" ");
        String ilkad=str.substring(0,ilkSpace).trim().toUpperCase();
        String ikinciAdir=str.substring(ilkSpace,sonSpace).trim().toUpperCase();
        String sonadir=str.substring( sonSpace).trim().toUpperCase();

        System.out.println(ilkad.substring(0,1)+"."+ikinciAdir.substring(0,1)+"."+sonadir.substring(0,1));




    }
}
