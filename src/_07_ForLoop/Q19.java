package _07_ForLoop;

public class Q19 {
    /*
     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
            Sonuç böyle olmalıdır;

                   *
                  * *
                 * * *
                * * * *
               * * * * *
     */

    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {

            for (int j = i; j <=5 ; j++) {

                System.out.print(" ");
            }

            for (int j = 1; j <=i ; j++) {
                System.out.print(" * ");

            }

            for (int j = i; j <=5 ; j++) {

                System.out.print(" ");
            }
            System.out.println();
        }


    }
}

