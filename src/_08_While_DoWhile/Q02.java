package _08_While_DoWhile;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
        // TASK : indexi tek sayi olan karakterleri yazdiran bir code create ediniz

        String str="Java guzeldır.";
        int strUzunluk=str.length();
        int index=1;
        while (index<=strUzunluk){

            System.out.print(str.substring(index,index+1));
        index+=2;
        }

    }

}
