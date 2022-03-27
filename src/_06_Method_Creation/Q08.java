package _06_Method_Creation;

import java.util.Scanner;

public class Q08 {
  /*
    TASK :
    Kullanıcıdan aldığınız bir String'deki kelimeleri sondan başa doğru yerleştiren
    String parametreli return type li reverseWord isminde bir method create ediniz

     Test Data :
    İnput : Allah Javacı arkadaşlara zihin açıklığı versin
    Output : versin açıklığı zihin arkadaşlara Javacı Allah
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print(" bir cumle gırınız : ");
        String cumle = scan.nextLine();


        System.out.println(reverseWord(cumle));

    }

    private static String reverseWord(String cumle) {

        int sonindex = cumle.lastIndexOf(" ");
        String tersCumle = "";
        int boslukSayısı = cumle.replaceAll("\\S", "").length();

        for (int i = 0; i < boslukSayısı + 1; i++) {
            if (sonindex >= 0) {
                tersCumle += cumle.substring(sonindex);
                cumle = cumle.substring(0,sonindex);
                sonindex = sonindex = cumle.lastIndexOf(" ");
            }
        }
        tersCumle += " " + cumle;

        return tersCumle;
    }


}
