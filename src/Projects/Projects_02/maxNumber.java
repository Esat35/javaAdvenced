package Projects.Projects_02;

public class maxNumber {


      /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}

        print the max number from the 2d array

     */


     /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}

         int 2D arrayini  olustur

        2D arrayinden max number print et

     */


    public static void main(String[] args) {

     /*
        Bu satırdan önceki satırlarda hicbirşeyi silme ve degiştirme
        koda burdan basla
        array1 and array2  kullan

      */

        int array1[][]={{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}};
        int maxNumberOfSecond=array1[0][0];

        for (int i=0; i<array1.length; i++){

            maxNumberOfSecond=array1[i][0];

            for (int j=0; j< array1[i].length;j++){

                maxNumberOfSecond=Math.max(maxNumberOfSecond,array1[i][j]);

            }
            System.out.print(maxNumberOfSecond+" ");
        }

    }

}
