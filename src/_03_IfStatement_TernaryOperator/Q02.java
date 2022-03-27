package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
	/*  TASK :
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

	    INFO :
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen 
		 
	 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenın  kenar uzunluklarını gırınız");

        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();


        if (kenar1 < 0 || kenar2 < 0 || kenar3 < 0) {

            System.out.println("kenar uzunlukları negatif olamaz");

        } else if (((kenar1 + kenar2) > kenar3 && (kenar1 - kenar2) < kenar3) && (((kenar1 + kenar3) > kenar2 && (kenar1 - kenar3) < kenar2) && ((kenar3 + kenar2) > kenar1) && (kenar3 - kenar2) < kenar1)) {

            System.out.println("girdiğiniz degerler üçgen belirtir");

            if (kenar1 == kenar2 && kenar1 == kenar3) {
                System.out.println("bu bir eşkenar üçgen ");
            } else {
                System.out.println("bu bir çeşitkenar üçgen");
            }

        } else {
            System.out.println("girdiğiniz degerler üçgen belirtmez..");

        }

    }
}