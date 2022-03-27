package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */

int arr[]={1,5,6,8,9,7};

tekElemanlıBul(arr);

    }

    private static void tekElemanlıBul(int[] arr) {

        int arr2[]=new int[arr.length/2];


        for (int i=0; i<arr2.length; i++){
            arr2[i]=arr[2*i+1];

        }


        System.out.println("tek elemanlı array : "+ Arrays.toString(arr2));


    }


}
