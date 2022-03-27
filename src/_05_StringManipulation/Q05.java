package _05_StringManipulation;

public class Q05 {
    public static void main(String[] args) {
    /*
        TASK :
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.

     */
String str1="%13.99";
String str2="%10.55";

str1=str1.replaceAll("\\D","");
str2=str2.replaceAll("\\D","");

double sayı1 =Double.parseDouble(str1);
double sayı2 =Double.parseDouble(str2);

double toplam=(sayı1+sayı2)/100;
        System.out.println(toplam);

    }
}
