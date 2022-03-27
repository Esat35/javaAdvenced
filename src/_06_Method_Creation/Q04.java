package _06_Method_Creation;

import java.util.Locale;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*  TASK :
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden method create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner scan=new Scanner(System.in);
        System.out.print(" bir cumle gırınız : ");
        String str= scan.nextLine();

        System.out.println(xyzVarMi(str));


    }

    private static boolean xyzVarMi(String str) {
boolean cevap=false;
        if (str.toLowerCase(Locale.ROOT).contains("xyz")){
           cevap=true;
        }
        return cevap;
    }

}
