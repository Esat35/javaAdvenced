package _07_ForLoop;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /* TASK :
        Kullanicidan bir String isteyin. Kullanicinin girdigi
        String’in palindrome olup olmadigini kontrol eden bir program yazin.

         */

        Scanner scan=new Scanner(System.in);
        System.out.print("bir cumle gırınız : ");
        String cumle= scan.nextLine();
        String tersStr="";

        for (int i=0; i<cumle.length();i++){

            tersStr+=cumle.substring(cumle.length()-1-i,cumle.length()-i);

        }

        if (cumle.equalsIgnoreCase(tersStr)){
            System.out.println("gırılen cumle palındrome");
        }else System.out.println("gırılen cumle palındrome degil!");
    }

}

