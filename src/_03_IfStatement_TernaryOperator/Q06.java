package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //TASK :  Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("koordinat noktasının apsisini giriniz :");
        double apsis = scan.nextDouble();
        System.out.println("koordinat noktasının ordinatını giriniz :");
        double ordinat = scan.nextDouble();

        if (ordinat == 0 && apsis == 0) {
            System.out.println("nokta orjindedir");
        } else if (ordinat == 0 && apsis != 0) {
            System.out.println("nokta X ekseni üzerindedir.");
        } else if (ordinat != 0 && apsis == 0) {
            System.out.println("nokta Y ekseni üzerindedir");
        } else if (ordinat > 0 && apsis > 0) {
            System.out.println("nokta 1. Bölgede ");
        } else if (ordinat > 0 && apsis < 0) {
            System.out.println("nokta 2. Bölgede");
        } else if (ordinat < 0 && apsis < 0) {
            System.out.println("nokta 3. Bölgede");
        } else {
            System.out.println("nokta 4. Bölgede");
        }


    }
}
