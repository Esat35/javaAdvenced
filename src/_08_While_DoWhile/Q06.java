package _08_While_DoWhile;

import java.util.Scanner;

public class Q06 {


    public static void main(String[] args) {
		/*TASK :
		 kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
		 kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

		 */

        Scanner scan = new Scanner(System.in);
        System.out.print("bolunen sayıyı gırınız : ");
       int bolunen = scan.nextInt();
        System.out.print("bolen sayıyı gırınız : ");
        int bolen = scan.nextInt();

        bol(bolunen,bolen);


    }

    private static void bol(int bolunen, int bolen) {


        int bolum=0;

        do {
            bolunen-=bolen;
            bolum++;
        }while (bolunen>=0);

        System.out.println("bolum : "+(bolum-1));

    }

}


