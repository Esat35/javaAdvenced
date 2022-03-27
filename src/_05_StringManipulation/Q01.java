package _05_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
Scanner scan=new Scanner(System.in);
        System.out.print("bir cumle gırınız : ");
        String str=scan.nextLine();

        if(str.contains(" ")){
            System.out.println("cumle boşluk karakteri içeriyor");
        }else System.out.println("cumle bosluk karakterı ıcermıyor..");


    }
}

