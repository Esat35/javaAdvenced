package _09_Arrays;


import java.util.Arrays;

public class Q10 {

    public static void main(String[] args) {
        /*
         TASK:
         you have a string "GayetBasarılı"
         with arrays change it to "CoookBasarılı" and write changing array
         (String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )

         */

        String str = "GayetBasarılı";
        String arr2[] = new String[1];
        String str2 = "";
        String arr[] = str.split("t");

        arr[0] = "Coook";


        for (int i = 0; i < arr.length; i++) {
            str2 += arr[i];
        }

        arr2[0] = str2;
        System.out.println(Arrays.toString(arr2));
    }

}
