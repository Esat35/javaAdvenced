package _08_While_DoWhile;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        ve x girildiğinde ise "Program bitti" yazan programı yazınız.
xx
       */
        Scanner scan=new Scanner(System.in);

        char sonlandır='a';
        do {
            System.out.println("Program çalışıyor");
            System.out.println("Çıkış ıcın x e basınız : ");
            sonlandır=scan.next().charAt(0);
        }while (sonlandır!='x');
        System.out.println("Program bitti");
    }
}
