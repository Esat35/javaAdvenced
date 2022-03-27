package _08_While_DoWhile;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        // TASK : STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.

        String pınKodu="1201";

        Scanner scan=new Scanner(System.in);
        int sayı=3;

        do {
            System.out.println("sıfreyı gırınız : "+"\n"+(sayı)+" hakkınız kaldı");
            String str=scan.nextLine();

            if (pınKodu.equals(str)){
                System.out.println("tebrikler sıfreyı bıldınız");
            }
            sayı--;
        }while(sayı>0);


    }
}
