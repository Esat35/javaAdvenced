package _10_List;

import java.util.ArrayList;
import java.util.List;

public class QAsalSayi_T {

    /* TASK :
    100 den kucuk asal sayilari yazdiran bir code create ediniz.
     */
    public static void main(String[] args) {
        boolean asalMı = true;

        for (int i = 2; i < 100; i++) {

            asalMı = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    asalMı = false;
                }

            }

            if (asalMı) {
                System.out.print(i + " ");
            }

        }

    }
}
