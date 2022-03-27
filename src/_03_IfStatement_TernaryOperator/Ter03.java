package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter03 {

    public static void main(String[] args) {
        /*
        TASK :
         Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
         3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
         Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir pozitif tamsayı gırınız :");
        int sayı= scan.nextInt();

        System.out.println( ((sayı>=100&&sayı<=999)||(sayı<=-100&&sayı>=-999))?("sayı üç basamaklı"):((sayı%2==0)?"üç basamaklı olmayan çift sayı":"üç basamaklı olmayan tek sayı"));


    }
}