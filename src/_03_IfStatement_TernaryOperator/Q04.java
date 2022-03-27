package _03_IfStatement_TernaryOperator;

import java.util.Locale;
import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
		/*  TASK :
		 *  Kullanicidan IT alanini bilgisini alarak console'a
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		bilgilileri yazdiriniz
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("IT alanınızı giriniz : qa, dev, ba, pm ");
        String str = scan.next().toLowerCase();

        if (str.equals("qa")) {
            System.out.println("Quality Analyst");
        } else if (str.equals("dev")) {
            System.out.println("Developer");
        } else if (str.equals("ba")) {
            System.out.println("Busines Analyst");
        } else if (str.equals("pm")) {
            System.out.println("Project Manager");
        } else {
            System.out.println("hatalı giriş tkrar deneyiniz.");
        }


    }

}
