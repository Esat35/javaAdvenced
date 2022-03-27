package _06_Method_Creation;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
         /*
        TASK :
        Bir String içinde kaç kelime olduğunu yazdıran bir method create ediniz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */

Scanner scan=new Scanner(System.in);
        System.out.print("bir cumle gırınız : ");
        String cumle= scan.nextLine();

        kelimeSayısıBul(cumle);


    }

    private static void kelimeSayısıBul(String cumle) {

        cumle=cumle.trim();
     cumle= cumle.replaceAll("\\S","");
        System.out.println(cumle);
     int boslukSayısı=cumle.length();

        System.out.println("girilen cumledekı kelıme sayısı : "+(boslukSayısı+1));
    }
}
