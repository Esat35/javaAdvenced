package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q14 {
    /* Günün sorusu: if statement
      katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.

        ax^2 + bx + c;

        Çözüm adımları
        kullanıcıdan a,b,c yi okutun.
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.
   */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("ax^2 + bx + c = 0    denkleminin kat sayılarını gırınız");
        System.out.println(" a :");
        double a = scan.nextDouble();

        System.out.println(" b :");
        double b = scan.nextDouble();

        System.out.println(" c :");
        double c = scan.nextDouble();


        double delta = b * b - 4 * a * c;

        if (delta == 0) {
            System.out.println("denklemin çözum kumesı :  X = " + (-b / 2 * a));

        } else if (delta > 0) {

            System.out.println("denklemin çözum kumesı : X1 = " + (-b + Math.sqrt(delta)) / 2 * a + "   X2 = " + (-b - Math.sqrt(delta)) / 2 * a);
        } else {
            System.out.println("denklemin kökü yok");
        }


    }
}
