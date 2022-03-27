package _07_ForLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */
Scanner scan=new Scanner(System.in);
int sayı=0;
int toplam=0;

        for (int i = 1; i <=5 ; i++) {

            System.out.print(i+". sayıyı gırınız : ");
            sayı= scan.nextInt();
            if (!(sayı>=5&&sayı<=10)){
                toplam+=sayı;

            }

        }

        System.out.println("5 ile 10 arasındakı sayılar harıc gırılen sayıların toplamı : "+toplam);

    }

}
