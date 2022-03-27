package _09_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q07 {

    public static void main(String[] args) {
        /* TASK :
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,-3},{41,55},{-61,-17,80}}
         * Output : 80
         */
        int arr[][] = {{1, 2, -3}, {41, 55}, {-61, 63, 8}};
        System.out.println("girdiginiz array'in max elemanı : "+maxDegerBul(arr));

    }
    public  static  int maxDegerBul(int arr[][]){
        int max=arr[0][0];//methoddan return edilecek max elemanın atanacagı cont cretae edildi

        for(int kat=0; kat<arr.length; kat++){//kat kontrolu yapıldı
            for(int daire=0; daire<arr[kat].length; daire++){//daire kontrolu yapıldı
                if(arr[kat][daire]>max){
                    max=arr[kat][daire];
                }

            }
        }
        return max;
    }
}













