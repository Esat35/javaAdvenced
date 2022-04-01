package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class T01_UzunKelime{
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */
Scanner scan=new Scanner(System.in);
        System.out.print("bir cumle gırınız : ");
        String cumle= scan.nextLine();

       String enUzunKlime= LongestWord(cumle);
        System.out.println("cumledekı en uzun kelıme : "+enUzunKlime);

    }

    private static String LongestWord(String cumle) {
        String arr[]=cumle.split(" ");
        System.out.println(Arrays.toString(arr));
        int kelimeUzunlugu=0;
        String uzunKelime="";

        for (int i=0; i<arr.length; i++) {
           arr[i]= arr[i].replaceAll("\\W","");
           if (arr[i].length()>kelimeUzunlugu){
               uzunKelime=arr[i];
               kelimeUzunlugu=arr[i].length();
           }

            }
        System.out.println(Arrays.toString(arr));

        return uzunKelime;
    }
}
