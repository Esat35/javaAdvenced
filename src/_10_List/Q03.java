package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
int arr[]={2,5,6,-4,-7,1};

int toplam=0;

for (int i=0; i<arr.length; i++){
    toplam+=arr[i]*arr[i];

}
        System.out.println("toplam = " + toplam);
    }
}
