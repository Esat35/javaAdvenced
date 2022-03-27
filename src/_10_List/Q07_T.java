package _10_List;

import java.util.ArrayList;
import java.util.List;

public class Q07_T {

    public static void main(String[] args) {
		/* TASK :
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */

        int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1};

        List<Integer> l1=new ArrayList<Integer>();
        List<Integer> l2=new ArrayList<Integer>();

        if (arr1.length%2==0){

            for(int i=0; i<arr1.length/2; i++)
            {
                l1.add(arr1[i]);
            }

            for (int i = arr1.length-1; i>=arr1.length/2  ; i--) {
                l2.add(arr1[i] );
            }

            System.out.println(l1);
            System.out.println(l2);

            if (l1.equals(l2)) {

                System.out.println("ayna");
            }else {
                System.out.println("ayna degil");
            }

        }else System.out.println("array sımetrık degıl!!");

    }

}
