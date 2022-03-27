package _08_While_DoWhile;

import java.util.Scanner;

public class Q10_T {

    public static void main(String[] args) {
        //TASK :  Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.


        Scanner scan=new Scanner(System.in);

        int sayac=0;
        int sayı=0;
        int ilkDeger;
        int buyukSayı=0;

        do {
            ilkDeger=sayı;
            System.out.print(sayac+1+".sayı : ");
            sayı=scan.nextInt();
            sayac++;

            if(sayı>ilkDeger){
                buyukSayı=sayı;
            }


        }while (sayac<5);

        System.out.println("girilen sayıların en buyugu : "+buyukSayı);

    }
}


