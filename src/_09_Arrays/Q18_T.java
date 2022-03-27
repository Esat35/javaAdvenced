package _09_Arrays;

import java.util.Arrays;

public class Q18_T {
    public static void main(String[] args) {
        /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */
        String str = "Javacilar cook afilli";

        String[] array = str.replace(" ", "").split("");

        System.out.println(Arrays.toString(array));
        String tekarsızStr = "";

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (!tekarsızStr.contains(array[i])) {
                    tekarsızStr += array[i];
                }
            }
        }


        String[] yeniArrays = new String[tekarsızStr.length()];

        for (int i = 0; i < tekarsızStr.length(); i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {

                if (tekarsızStr.substring(i, i + 1).equals(array[j])) {
                    count++;
                }


            }
            yeniArrays[i] = tekarsızStr.substring(i, i + 1) + "=" + count;
        }

        System.out.println(Arrays.toString(yeniArrays));

    }
}
    

