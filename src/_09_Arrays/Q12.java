package _09_Arrays;

import java.util.Arrays;

public class Q12 {

    public static void main(String[] args) {
        //Aşağıdaki multi dimensional array’in iç array’lerindeki tum elemanların
        //toplamını birer birer bulan ve herbir sonucu yeni bir array’in elemanı yapan
        // ve yeni array’i ekrana yazdıran bir program yazınız
        // Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}


        int arr[][]={ {1,2,3}, {4,5}, {6,7} };

        int arr2[]=new int[arr.length];

        for (int i=0; i<arr.length; i++){
            int toplam=0;
            for (int j=0; j<arr[i].length; j++){
                toplam+=arr[i][j];
            }
            arr2[i]=toplam;
        }

        System.out.println("arr2 = " + Arrays.toString(arr2));
    }
}
