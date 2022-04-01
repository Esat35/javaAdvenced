package Projects.Projects_02;

public class minNumber {

      /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

        print the min number from the 2d array
     */


     /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

         int 2D arrayini  olustur

        2D arrayinden min number print et

     */


    public static void main(String[] args) {
          /*
        Bu satırdan önceki satırlarda hicbirşeyi silme ve degiştirme
        koda burdan basla
        array1 and array2  kullan

      */

        int array1[][]={{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}};
        int minNumberOfSecond=array1[0][0];

        for (int i=0; i<array1.length; i++){

            for (int j=0; j< array1[i].length;j++){
                minNumberOfSecond=array1[i][0];//inner arrayın ılk elemanını mınımum kabul ettık.
                minNumberOfSecond=Math.min(minNumberOfSecond,array1[i][j]);

            }
            System.out.print(minNumberOfSecond+" ");

        }

    }

}
