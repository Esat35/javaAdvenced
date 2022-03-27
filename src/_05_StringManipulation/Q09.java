package _05_StringManipulation;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */

        Scanner scan=new Scanner(System.in);
        System.out.print("çift sayıda karakter ıceren bır kelıme gırınız: ");
String kelıme=scan.next();

if (kelıme.length()%2==0){
    String ilkYarısı=kelıme.substring(0,kelıme.length()/2);
    System.out.println("kelimenın ılk yarısı : " + ilkYarısı);

}else System.out.println("kelimenın karakter sayısı tek sayı oldugu ıcın ıslem yapılamadı ..");


    }
}
