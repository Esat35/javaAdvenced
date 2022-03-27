package _05_StringManipulation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // TASK : Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("4 harfli bir kelime giriniz : ");
        String str = scan.next();
        String bosStr="";
        if (str.length() == 4){
          bosStr += str.substring(3);
        bosStr += str.substring(2, 3);
        bosStr += str.substring(1, 2);
        bosStr += str.substring(0, 1);

        System.out.println(bosStr);
    }else System.out.println("hatalı gırıs..");
    }
}
