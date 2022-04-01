package Projects.Projects_02;

import java.util.Scanner;

public class sameFirstAndLast {
   /*

    Given an array of ints, print true if the array is length 1 or more, and the first element and the last element are equal.

    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
    sameFirstLast([1]) → true

    print just true or false

    */


    /*

    Bir int array verildiğinde, array uzunluğu 1 veya daha fazlaysa ve ilk öğe ile son öğe eşitse true değerini yazdırın.

    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
    sameFirstLast([1]) → true

    sadece  true veya false print et

    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] useThisArray = myStr.split("");

      //  code start here
      // Koda burdan başlayin
        int arr[]=new int[useThisArray.length];

        for (int i = 0; i <useThisArray.length ; i++) {
          int  num = myStr.indexOf(useThisArray[i] );
          arr[i] = num;
        }

        if (arr.length==1||arr[0]==arr[arr.length-1]){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }


}
